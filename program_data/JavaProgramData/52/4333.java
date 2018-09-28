package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[2000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n + 1;i <= 2 * n;i++)
		{
			a[i] = a[i - n];
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=&a[1];
		int p = a[1];
		System.out.print(a[n - m + 1]);
		for (i = 1;i <= n - 1;i++)
		{
			*(p + i) = *(p + n - m + i);
			System.out.print(" ");
			System.out.print((p + i));
		}
		System.out.print("\n");



		return 0;
	}

}

