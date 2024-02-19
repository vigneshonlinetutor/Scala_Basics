import s.Chess

/*
Different Ways to Implement Access Modifiers in Scala:

1. Using Private Access Modifier:
- Marking members as `private` ensures they are only accessible within the same class or object.

2. Using Protected Access Modifier:
- Marking members as `protected` allows access within the same class or object and by its subclasses.

3. Using No Modifier (Public Access):
- Members without explicit access modifiers are by default `public` within the package.
 */

// PRIVATE MODIFIER
class Outer{
  class Inner{
    private def display(): Unit = {println("Hi Scala")
      display()
      class InnerMost{
        display()
      }
    }
  }
  val innerObj = new Inner()
//  innerObj.display()
}

// PROTECTED MODIFIER
package p{
  class Super{
    protected def display(): Unit = {println("Hi Scala")
    }
  class Sub extends Super{
  display()
  }
  }
}

class Other{
//  (new p.Super).display()
}

//PUBLIC MODIFIER
package s{
  class Chess{
    def display(): Unit = {println("Hi Scala")
      display()
  }
  class Carrom extends Chess{
    display()
    }
  }

  class archery{
    (new Chess).display()
  }
}

class horse{
  (new Chess).display()
}
