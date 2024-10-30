const postForm = document.querySelector('.post-form');
const usernameInput = document.querySelector('#username');
const questionInput = document.querySelector('#question');
const postBtn = document.querySelector('#post-btn');
const postsContainer = document.querySelector('.posts-container');

let posts = [];

function createPost(username, question) {
    const post = { username, question, replies: [] };
    posts.push(post);
    displayPosts();
}

function displayPosts() {
    postsContainer.innerHTML = '';
    posts.forEach((post, index) => {
        const postHTML = `
            <div class="post">
                <span class="username">${post.username}</span>
                <p class="question">${post.question}</p>
                <div class="replies">
                    ${post.replies.map(reply => `
                        <div class="reply">
                            <span class="username">${reply.username}</span>
                            <p>${reply.reply}</p>
                        </div>
                    `).join('')}
                </div>
                <button class="reply-btn" data-index="${index}">Reply</button>
            </div>`;
        postsContainer.insertAdjacentHTML('beforeend', postHTML);
    });
}

function createReply(index, username, reply) {
    posts[index].replies.push({ username, reply });
    displayPosts();
}

postBtn.addEventListener('click', () => {
    const username = usernameInput.value.trim();
    const question = questionInput.value.trim();
    if (username && question) {
        createPost(username, question);
        usernameInput.value = '';
        questionInput.value = '';
    }
});

postsContainer.addEventListener('click', (e) => {
    if (e.target.classList.contains('reply-btn')) {
        const index = e.target.dataset.index;
        const replyUsername = prompt('Enter your username:');
        const reply = prompt('Enter your reply:');
        if (replyUsername && reply) {
            createReply(index, replyUsername, reply);
        }
    }
});