package ch.tutteli.atrium.assertions

import ch.tutteli.atrium.creating.AssertionPlant
import ch.tutteli.atrium.creating.AssertionPlantNullable
import ch.tutteli.atrium.domain.builders.creating.AssertImpl

@Deprecated("use AssertImpl.any.toBe, will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.any.toBe(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any> _toBe(plant: AssertionPlant<T>, expected: T): Assertion
    = AssertImpl.any.toBe(plant, expected)

@Deprecated("use AssertImpl.any.notToBe, will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.any.notToBe(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any> _notToBe(plant: AssertionPlant<T>, expected: T): Assertion
    = AssertImpl.any.notToBe(plant, expected)

@Deprecated("use AssertImpl.any.isSame, will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.any.isSame(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any> _isSame(plant: AssertionPlant<T>, expected: T): Assertion
    = AssertImpl.any.isSame(plant, expected)

@Deprecated("use AssertImpl.any.isNotSame, will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.any.isNotSame(plant, expected)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any> _isNotSame(plant: AssertionPlant<T>, expected: T): Assertion
    = AssertImpl.any.isNotSame(plant, expected)

@Deprecated("use AssertImpl.any.isNull, will be removed with 1.0.0",
    ReplaceWith(
        "AssertImpl.any.isNull(plant)",
        "ch.tutteli.atrium.creating.AssertImpl"
    )
)
fun <T : Any?> _isNull(plant: AssertionPlantNullable<T>): Assertion
    = AssertImpl.any.isNull(plant)
