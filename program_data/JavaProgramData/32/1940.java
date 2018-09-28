package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a0 = new String(new char[100]);
		String b0 = new String(new char[100]);
		int i;
		int j;
		int k;
		int l;
		int add;
		int n;
		int x;
		int y;
		int[] a = new int[100];
		int[] b = new int[100];
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a0 = tangible.StringFunctions.changeCharacter(a0, i, '\0');
			}
				b0 = tangible.StringFunctions.changeCharacter(b0, i, '\0');
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a0 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b0 = tempVar3.charAt(0);
			}
			x = a0.length();
			y = b0.length();
			for (j = 0;j < x;j++)
			{
				if (a0.charAt(j) != '\0')
				{
				a[j] = a0.charAt(j) - 48;
				}
			}

			for (j = 0;j < y;j++)
			{
				if (b0.charAt(j) != '\0')
				{
				b[j] = b0.charAt(j) - 48;
				}
			}

			for (k = x - 1,l = 99;k >= 0;k--,l--)
			{
				a[l] = a[k];
			}
			for (;l >= 0;l--)
			{
				a[l] = 0;
			}
			for (k = y - 1,l = 99;k >= 0;k--,l--)
			{
				b[l] = b[k];
			}
			for (;l >= 0;l--)
			{
				b[l] = 0;
			}
				add = 0;
			for (j = 99;j >= 100 - x;j--)
			{
				if ((a[j] - add) < b[j])
				{
					c[i][j] = a[j] + 10 - b[j] - add;
					add = 1;
				}
				else
				{
					if ((a[j] - add) >= b[j])
					{
						c[i][j] = a[j] - b[j] - add;
						add = 0;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 100;j++)
			{
				if (c[i][j] != 0)
				{
					break;
				}
			}
				k = j;
			for (;k < 100;k++)
			{
				System.out.printf("%d",c[i][k]);
			}
			System.out.print("\n");
		}
	}

}

