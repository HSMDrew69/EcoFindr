document.addEventListener('DOMContentLoaded', () => {
    const app = document.getElementById('app');

    const header = document.createElement('header');
    header.innerHTML = `
        <h1>Welcome to EcoFindr</h1>
        <p>Your guide to sustainable and eco-friendly alternatives.</p>
    `;
    app.appendChild(header);

    const featuresSection = document.createElement('section');
    featuresSection.className = 'features';
    featuresSection.innerHTML = `
        <h2>What We Offer</h2>
        <div class="feature">
            <h3>Eco-Friendly Product Listings</h3>
            <p>Discover a wide range of sustainable alternatives to everyday items.</p>
        </div>
        <div class="feature">
            <h3>Expert Reviews</h3>
            <p>Learn about the impact of your choices with detailed product analyses.</p>
        </div>
        <div class="feature">
            <h3>Community Tips</h3>
            <p>Share and learn sustainable habits from our eco-conscious community.</p>
        </div>
    `;
    app.appendChild(featuresSection);

    const ctaSection = document.createElement('section');
    ctaSection.className = 'call-to-action';
    ctaSection.innerHTML = `
        <h2>Join the Movement</h2>
        <p>Sign up for updates and tips on living sustainably.</p>
        <button id="signup-btn">Sign Up</button>
    `;
    app.appendChild(ctaSection);

    const signupButton = document.getElementById('signup-btn');
    signupButton.addEventListener('click', () => {
        alert('Thank you for your interest! Sign-up functionality coming soon.');
    });
});
