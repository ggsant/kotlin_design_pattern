package strategy

abstract class MovementBehavior {
    abstract fun move()
}

class Fly: MovementBehavior() {
    override fun move(): Unit = println("I'm flying")
}

class Walk: MovementBehavior() {
    override fun move(): Unit = println("I'm walking")
}

class Swim: MovementBehavior() {
    override fun move(): Unit = println("I'm swimming")
}
