package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100];
		int[] p = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i] = a[i];
		}
		for (i = 0;i < n - m;i++)
		{
			p[i + m] = a[i];
		}
		for (i = 0;i < m;i++)
		{
			p[i] = a[n - m + i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(p[i]);
			System.out.print(" ");
		}
		System.out.print(p[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

