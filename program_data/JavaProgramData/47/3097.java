package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int x;
		 int n;
		 int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 int * q;
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (p = a;p < a + n;p++)
			{
				*p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		   for (p = a,q = a + n - 1;p < q;p++,q--)
		   {
				x = p;
			 *p = q;
			 *q = x;
		   }
		   for (p = a;p < a + n;p++)
		   {
					if (p > a)
					{
						System.out.print(' ');
					}
				 System.out.print(p);
		   }
		 return 0;
	}
}

