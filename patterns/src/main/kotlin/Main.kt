import strategy.Cat
import strategy.Dog
import strategy.Duck
import strategy.Fish

fun main() {
    val cat = Cat()
    cat.performMovement()
    cat.performSound()

    val dog = Dog()
    dog.performMovement()
    dog.performSound()

    val fish = Fish()
    fish.performMovement()
    fish.performSound()

    val duck = Duck()
    duck.performMovement()
    duck.performSound()
}