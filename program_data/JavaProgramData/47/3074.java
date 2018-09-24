package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[101];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] p = a;
		for (i = 0,j = n - 1;i < j;i++,j--)
		{
			temp = (p + i);
			p[i] = (p + j);
			p[j] = temp;
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.print(p[i]);
			}
			else
			{
				System.out.print(p[i]);
				System.out.print(' ');
			}
		}
	}
}

