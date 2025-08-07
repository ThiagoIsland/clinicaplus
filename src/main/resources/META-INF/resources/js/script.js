document.addEventListener('DOMContentLoaded', function() {
    // Get the menu button and sidebar
    const menuButton = document.querySelector('.menu-button');
    const sidebar = document.querySelector('.layout-sidebar');
    
    // Add click event to toggle sidebar on mobile
    if (menuButton && sidebar) {
        menuButton.addEventListener('click', function(e) {
            e.preventDefault();
            sidebar.classList.toggle('active');
        });
    }
    
    // Close sidebar when clicking outside on mobile
    document.addEventListener('click', function(e) {
        if (window.innerWidth <= 992 && 
            sidebar && 
            sidebar.classList.contains('active') && 
            !sidebar.contains(e.target) && 
            !menuButton.contains(e.target)) {
            sidebar.classList.remove('active');
        }
    });
});