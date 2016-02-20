# bndtoosl-abc

This is just the smallest useless project aimed at understanding the basics of bndtools and testing of OSGi components.

For memo, here's how it was created:

    > bnd add workspace bndtools-abc
    > cd bndtools-abc
    > bnd add plugin gradle
    > bnd add plugin git
    > bnd add project abc
    > mkdir -p abc/src/abc/
    > mkdir -p abc/test/abc/test
    > vi abc/src/abc/Activator.java
    > vi abc/test/abc/test/Activator.java
    > vi build.gradle
    > vi settings.gradle
    > vi abc/bnd.bnd
    > vi abc/abc.bnd
    > vi abc/test.bnd

