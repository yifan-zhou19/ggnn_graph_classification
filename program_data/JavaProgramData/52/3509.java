package <missing>;

public class GlobalMembers
{
	//*******************//
	//*???????   *//
	//*?????       *//
	//*???2010.12.10 *//
	//*******************//
	public static int Main()
	{
	 int[] a = new int[100];
	 int n;
	 int m;
	 int i;
	 int counter = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
	   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 int * p;
	 for (p = a + n - m;;p++)
	 {
	   if (p != a + n - 1)
	   {
		   if (counter != n - 1)
		   {
			 System.out.print(p);
			 System.out.print(" ");
		   }
		   else
		   {
			 System.out.print(p);
		   }
	   }
	   else
	   {
		   System.out.print(p);
		   System.out.print(" ");
		   p = a - 1;
	   }
	   counter++;
	   if (counter == n)
	   {
		   break;
	   }
	 }
	 return 0;
	}
}

