discussion-points
=================

Code to discuss!

The Osgi Version Problem.

I wish to create a Provider/Consumer model where the Provider<T> can be hooked to a Consumer<T>.
However, when I publish a Provider<T> service, I cannot see how to validate the versions of T before 
giving it to a Consumer<T>.
It seems I can only validate that the Provider interface is at the correct API level (not the objects 
it works with).
Therefore if T is at 2.0 in the provider and Consumer is only using T at 1.0 how do you ensure you don't
wire the two together?


Please read licence files in any folder, they will likely apply to that folder and any sub-folders.
