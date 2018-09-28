package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] longa = new int[100];
		int[] longb = new int[100];
		int[] t = new int[100];
		char[][] a = new char[100][101];
		char[][] b = new char[100][101];
		char[][] c = new char[100][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			b[i] = new Scanner(System.in).nextLine();
			System.in.read();
			longa[i] = String.valueOf(a[i]).length() - 1;
			longb[i] = String.valueOf(b[i]).length() - 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= longa[i];j++)
			{
				if (j <= longb[i])
				{
					c[i][longa[i] - j] = a[i][longa[i] - j] - b[i][longb[i] - j] + 48;
					if (c[i][longa[i] - j] < 48)
					{
						c[i][longa[i] - j] = c[i][longa[i] - j] + 10;
						a[i][longa[i] - j - 1]--;
					}
				}
				else
				{
					c[i][longa[i] - j] = a[i][longa[i] - j];
				}
			}
			for (j = 0,t[i] = 0;j <= longa[i];j++)
			{
				if (c[i][j] == 48)
				{
					t[i]++;
				}
				else
				{
					break;
				}
			}
			for (j = t[i];j < longa[i];j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			System.out.printf("%c\n",c[i][longa[i]]);
		}
	}

}

