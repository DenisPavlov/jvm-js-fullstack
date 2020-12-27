import react.child
import react.dom.render
import kotlinx.browser.document

fun main() {
    //document.getElementById("root")?.innerHTML = "Hello, Kotlin/JS! It's a Denis Pavlov's project!"
    render(document.getElementById("root")) {
        child(App)
    }
}
