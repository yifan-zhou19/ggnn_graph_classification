package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[101];
		int[] b = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		p = a;
		q = b;
		int i;
		for (i = 0 ; i <= n - 1 ; i++)
		{
			*(p + i) = ConsoleInput.readToWhiteSpace(true);
			*(q + i) = *(p + i);
		}
		for (i = m ; i <= n - 1 ; i++)
		{
			*(p + i) = *(q + i - m);
		}
		for (i = 0 ; i <= m - 1 ; i++)
		{
			*(p + i) = *(q + n - m + i);
		}
		for (i = 0 ; i <= n - 2 ; i++)
		{
			System.out.print((p + i));
			System.out.print(" ");
		}
		System.out.print((p + n - 1));
		System.out.print("\n");
		return 0;
	}
}

