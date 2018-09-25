package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[81];
		int n = 0;
		int i = 0;
		String s = new String(new char[45]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = a[0];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=&a[0];
		int q = a[0];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(s);
		p = p + s.length();
		for (i = 1;i < n;i++)
		{
		   s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   if (p + 1 + s.length() <= a[80])
		   {
		   System.out.print(' ');
		   System.out.print(s);
		   p = p + 1 + s.length();
		   }
		   else
		   {
		   System.out.print("\n");
		   System.out.print(s);
		   p = q + s.length();
		   }
		}
		return 0;
	}
}

