## jacoco4sbt demo

I've [proposed some changes](https://bitbucket.org/jmhofer/jacoco4sbt/pull-request/4/filter-scala-related-noise-from-jacoco/diff)
to jacoco4sbt to massage the output to increase the signal to nose ratio.

This amounts to being aware of the synthetic methods created by scalac
(forwarders, accessors, factories, equals/hashCode etc) and excluding them,
as well as hiding branch and instruction coverage.

Please feel free to try it out on your Scala project and see if its an
improvement over 2.1.1.

**UPDATE** These changes have been merged and published in jacoco4sbt 2.1.2
