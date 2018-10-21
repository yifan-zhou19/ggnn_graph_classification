package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] d =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i = 0;
		int j;
		int n;
		int k = 0;
		int cutpoint;
		while (true)
		{
			char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] e = {0, '\0', '\0', '\0'};
			char max;

		a[k] = new Scanner(System.in).nextLine();

			n = String.valueOf(a[k]).length();
			for (i = 0;i < 3;i++)
			{
				e[i] = a[k][n - 3 + i];
			}


			if (a[k][0] == 0)
			{
				break;
			}
					max = a[k][0];
			for (i = 0;i < n - 4;i++)
			{


				if (a[k][i] > max)
				{
					max = a[k][i];
					cutpoint = i;
				}
			}
			for (i = 0;i <= cutpoint;i++)
			{
				b[i] = a[k][i];
			}
			for (i = 0,j = cutpoint + 1;j < n - 4;i++,j++)
			{
				c[i] = a[k][j];
			}
			b += e;
			b += c;
			d[k] = b;
			 k++;
		}

		for (i = 0;i < k;i++)
		{
			System.out.println(d[i]);
		}
		return 0;
	}




}
