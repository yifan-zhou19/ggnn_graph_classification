package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[40];
		int[] b = new int[40];
		int[] c = new int[40];
		int n;
		a[0] = 1;
		b[-1] = 0;
		c[0] = 1;
		for (int k = 1;k < 40;k++)
		{
			a[k] = 0,c[k] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < n;j++)
		{
			for (int i = 0;i < 39;i++)
			{
				if (a[i] >= 5)
				{
				   b[i] = 1;
				}
				else
				{
					b[i] = 0;
				}
				a[i] = (2 * a[i]) % 10 + b[i - 1];
				if (a[i] != 0)
				{
					c[i] = 1;
				}
			}
		}
		for (int l = 39;l >= 0;l -= 1)
		{
			if (c[l] == 1)
			{
				System.out.print(a[l]);
			}
		}
	}

}

