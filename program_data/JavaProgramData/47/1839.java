package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * point;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		point = a[n - 1]; //point????????
		for (i = 0;i < n - 1;i++)
		{
		 System.out.print(point--);
		 System.out.print(' ');
		}
		System.out.print(point);
		return 0;
	}
}

