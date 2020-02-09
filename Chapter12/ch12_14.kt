import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxkotlin3.Observables

fun main(args: Array<String>) {
    val strings = Observable.just("Alpha", "Beta", "Gamma", "Delta")
    val numbers = Observable.range(1,4)
    val zipped = Observables.zip(strings, numbers) { s, n -> "$s $n" }
    zipped.subscribe(::println)
}