
# Dependency inversion principle
    
By declaring the Keyboard and Monitor with the new keyword, we've tightly coupled these three classes together.

Not only does this make our WindowsComputer hard to test, but we've also lost the ability to switch out our Keyboard class with a different one should the need arise. And we're stuck with our Monitor class too.















