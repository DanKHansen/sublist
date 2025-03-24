enum Sublist:
   case Equal, Unequal, Superlist, Sublist

object Sublist:
   def sublist(l1: List[Int], l2: List[Int]): Sublist =
      (l1, l2) match
         case t if t._1.contains(t._2) => Superlist
         case t if  t._1 == t._2 => Equal