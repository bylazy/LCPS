fun commonFactors(a: Int, b: Int) = (1..minOf(a,b)).count{a % it == 0 && b % it == 0}
