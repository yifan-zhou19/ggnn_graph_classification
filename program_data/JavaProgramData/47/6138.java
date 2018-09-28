package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tr;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] p = a;
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0,j = n - 1;i < j;i++,j--)
		{
			tr = (p + i);
			p[i] = (p + j);
			p[j] = tr;
		}
		for (int i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);


	return 0;
	}


}

