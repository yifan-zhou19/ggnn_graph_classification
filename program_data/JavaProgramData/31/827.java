public class student
{
   public student last;
   public String a = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  // freopen ( "1.in" , "r" , stdin );
	  // freopen ( "1.out" , "w" , stdout );

	   String a = new String(new char[100]);
	   student p;
	   student p1;
	   p = p1 =  new student();
	   p1.last = null;
	   p1.a = new Scanner(System.in).nextLine();
	   for (; ;)
	   {
		 a = new Scanner(System.in).nextLine();
		 if (strcmp(a, "end") == 0)
		 {
			 break;
		 }
		 p =  new student();
		 p.a = a;
		 p.last = p1;
		 p1 = p;
	   }
	   for (; ;)
	   {
		 System.out.printf("%s", p.a);
		 p = p.last;
		 if (p == null)
		 {
			 break;
		 }
		  else
		  {
			  System.out.print("\n");
		  }
	   }
	   return 0;
	}

}
