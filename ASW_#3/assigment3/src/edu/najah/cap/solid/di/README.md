
# Dependency inversion principle
    
By declaring the Keyboard and Monitor with the new keyword, we've tightly coupled these three classes together.

Not only does this make our WindowsComputer hard to test, but we've also lost the ability to switch out our Keyboard class with a different one should the need arise. And we're stuck with our Monitor class too.


<img width="623" alt="Screen Shot 2022-10-18 at 8 04 30 PM" src="https://user-images.githubusercontent.com/53263252/196498116-4f88c480-1ef0-4779-8650-5c052e9b4b7d.png">













