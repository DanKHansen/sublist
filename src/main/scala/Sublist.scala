enum Sublist:
   case Equal, Unequal, Superlist, Sublist

object Sublist:
   def sublist(l1: List[Int], l2: List[Int]): Sublist =
      (l1, l2) match
         case (Nil, Nil) | _ if l1 == l2 => Equal
         case _ if l1.containsSlice(l2)  => Superlist
         case _ if l2.containsSlice(l1)  => Sublist
         case _                          => Unequal
