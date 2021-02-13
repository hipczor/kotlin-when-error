package com.schibsted.whenlibrary

sealed class Exhaustive {
    object Yes: Exhaustive()
    object No: Exhaustive()
}
