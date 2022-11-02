package strategy

abstract class Animal {
    lateinit var movementBehavior: MovementBehavior
    lateinit var soundBehavior: SoundBehavior

    fun performMovement(): Unit = movementBehavior.move()
    fun performSound(): Unit = soundBehavior.move()

}

class Cat: Animal() {
    init {
        this.movementBehavior = Walk()
        this.soundBehavior = Meow()
    }
}

class Dog: Animal() {
    init {
        this.movementBehavior = Walk()
        this.soundBehavior = Bark()
    }
}

class Duck: Animal() {
    init {
        this.movementBehavior = Fly()
        this.soundBehavior = Quack()
    }
}

class Fish: Animal() {
    init {
        this.movementBehavior = Swim()
        this.soundBehavior = NoSound()
    }
}