package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
		int p = null;
		p = a[0];
		for (i = 0;i < n;i++)
		{
			*(p + i) = ConsoleInput.readToWhiteSpace(true);
		}
		System.out.print((p + n - 1));
		for (i = n - 2;i >= 0;i--)
		{
			System.out.print(' ');
			System.out.print((p + i));
		}
		return 0;
	}


}

