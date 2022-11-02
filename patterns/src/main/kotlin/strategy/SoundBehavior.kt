

package strategy

abstract class SoundBehavior {
    abstract fun move()
}

class Bark: SoundBehavior() {
    override fun move(): Unit = println("Au AU ")
}

class Meow: SoundBehavior() {
    override fun move(): Unit = println("miau")
}

class Quack: SoundBehavior() {
    override fun move(): Unit = println("quack")
}

class NoSound: SoundBehavior() {
    override fun move(): Unit = println("....")
}