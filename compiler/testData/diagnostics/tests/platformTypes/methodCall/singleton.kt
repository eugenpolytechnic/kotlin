// !WITH_NEW_INFERENCE
// !DIAGNOSTICS: -UNUSED_PARAMETER -UNUSED_VARIABLE

interface Foo

fun test() {
    var nullable: Foo? = null
    val foo: Collection<Foo> = <!TYPE_MISMATCH{NI}!>java.util.Collections.<!TYPE_INFERENCE_EXPECTED_TYPE_MISMATCH{OI}!>singleton(nullable)<!><!>
    val foo1: Collection<Foo> = java.util.Collections.singleton(nullable!!)
}
