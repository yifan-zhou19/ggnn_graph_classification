package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = a;
		for (int i = 0;i < n;i++)
		{
			int x;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			*p = x;
			p++;
		}
		 for (int i = n - 1;i > 0;i--)
		 {
			  p--;
			 System.out.print(p);
			 System.out.print(" ");
		 }
		  p--;
		  System.out.print(p);
		  return 0;
	}

}

