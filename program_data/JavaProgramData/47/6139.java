package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int tr;
		int i;
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
		for (p = a,i = 1;i < n;p++,i++)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.print((a + n - 1));
	return 0;
	}



}

