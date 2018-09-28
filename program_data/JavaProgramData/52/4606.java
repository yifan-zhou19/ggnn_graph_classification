package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}


		p2 = a + n - m;
		p1 = a;
		int temp;

		for (i = 0;i <= n - m;i++)
		{
			a[n + i] = (p1 + i);
		}
		for (i = 0;i <= n - 2;i++)
		{
		System.out.print((p2 + i));
		System.out.print(' ');
		}
		System.out.print((p2 + n - 1));
		return 0;


	}
}

