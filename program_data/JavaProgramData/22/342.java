package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n = 0;
		int i;
		int j;
		int len;
		int k = 0;
		int a = 0;
		int b = 0;
		int[] f = new int[300];
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		char d;
		i = 0;
		j = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				d = tempVar.charAt(0);
			}
			if (d == '\n')
			{
				c[i][j] = '\0';
				break;
			}
			else if (d == ',')
			{
				c[i][j] = '\0';
				i++;
				j = 0;
			}
			else
			{
				c[i][j] = d;
				j++;
			}
		}while (1 != 0);
		n = i + 1;
		for (i = 0;i < n;i++)
		{
			k = 0;
			for (j = 3;j >= 0;j--)
			{
				if ((c[i][j] != 0) && (k == 0))
				{
					f[i] = f[i] + c[i][j] - '0';
				k++;
				continue;
				}
				else if ((c[i][j] != 0) && (k == 1))
				{
					f[i] = f[i] + (c[i][j] - '0') * 10;
				k++;
				continue;
				}
				else if ((c[i][j] != 0) && (k == 2))
				{
					f[i] = f[i] + (c[i][j] - '0') * 10 * 10;
				k++;
				continue;
				}
				else if ((c[i][j] != 0) && (k == 3))
				{
					f[i] = f[i] + (c[i][j] - '0') * 10 * 10 * 10;
				k++;
				continue;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (f[i] > a)
			{
				b = a;
				a = f[i];
			}
			else if ((f[i] < a) && (f[i]> b))
			{
				b = f[i];
			}
		}
		if (b == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",b);
		}
	}

}

