package pl.grizzlysoftware.showcase.testing.simple_fuction

import spock.lang.Specification

class SimpleFunctionTest extends Specification {
    def "it should increase given argument by 10"() {
        given: "function instance and argument value"
            def function = new SimpleFunction()
            def argument = 50
        when: "function is called with argument 50"
            def result = function.increaseBy10(argument)
        then: "it should return 60"
            60 == result
    }
}
