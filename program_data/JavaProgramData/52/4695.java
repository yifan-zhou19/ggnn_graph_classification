package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: const int *p[n],*q[m];
		int[] p = new int[n]; //???????????
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q[m];
		int[] q = new int[m];
		for (i = 0;i < n;i++)
		{
			p[i] = a[i];
		}
		for (j = n - m;j < n;j++)
		{
			q[j - n + m] = a[j]; //????
		}
		for (i = 0;i < m;i++)
		{
			System.out.print(q[i]);
			System.out.print(' ');
		}
		for (j = 0;j < n - m - 1;j++)
		{
			System.out.print(p[j]);
			System.out.print(' ');
		}
		System.out.print(p[n - m - 1]);
		System.out.print("\n");
		return 0;
	}

}

