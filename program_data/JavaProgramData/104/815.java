package <missing>;

public class GlobalMembers
{
	public static void shu(int[] c, int k)
	{
		if (c[k - 1] != 1)
		{

		if (c[k - 1] % 2 == 0)
		{
			c[k] = c[k - 1] / 2;
			k++;
			shu(c, k);
		}
		else
		{
			c[k] = (c[k - 1] - 1) / 2;
			k++;
			shu(c, k);
		}
		}


	}
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int s = 0;
		int q;
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shu(a, 2);
		shu(b, 2);
		for (i = 1;i <= 99;i++)
		{
			for (j = 1;j <= 99;j++)
			{
				if (a[i] == b[j] && a[i] > 0)
				{
					System.out.print(a[i]);
					s = 1;
					break;
				}
			}
			if (s == 1)
			{
			break;
			}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

