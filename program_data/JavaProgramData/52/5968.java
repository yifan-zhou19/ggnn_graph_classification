package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int i;
		int[] a = new int[101];
		int j;
		int k;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		q = a; //??????????????
		for (i = 0;i < n - m;i++)
		{
			*(q + n + i) = *(q + i); //???????????????????
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print((q + n - m + i));
			System.out.print(' ');
		}
		System.out.print((q + n + n - m - 1));
		System.out.print("\n");


		return 0;
	}
}

