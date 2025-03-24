enum Sublist:
   case Equal, Unequal, Superlist, Sublist

object Sublist:
   def sublist(l1: List[Int], l2: List[Int]): Sublist =
      (l1.mkString("|"), l2.mkString("|")) match
         case ("", "") | _ if l1 == l2 => Equal
         case t if t._1.contains(t._2) => Superlist
         case t if t._2.contains(t._1) => Sublist
         case _                        => Unequal
