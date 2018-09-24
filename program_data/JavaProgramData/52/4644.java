package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q=null;
		int q = null;
		int i;
		int n;
		int m;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= m;i++)
		{
			x = a[n - 1];
			p = a[n - 1];
			for (;p != a[0];p--)
			{
				*p = (p - 1);
			}
			*(p--) = x;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[i]);
		return 0;
	}
}

