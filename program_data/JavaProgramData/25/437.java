package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//char str[101], end[101];
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[101];
		a[1] = 1;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= 100;i++)
			{



				a[i] = a[i] * 2;



			}
			for (i = 1;i <= 100;i++)
			{
					if (a[i] >= 10)
					{
					a[i + 1] = a[i + 1] + a[i] / 10;
					a[i] = a[i] % 10;

					}
			}

		}

		i = 100;
		while (a[i] == 0)
		{
			i--;
		}
		for (j = i;j >= 1;j--)
		{
			System.out.print(a[j]);
		}
		return 0;
	}


}

