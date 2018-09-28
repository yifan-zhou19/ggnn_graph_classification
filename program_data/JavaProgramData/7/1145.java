package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char[][] a = new char[3][257];
		int i;
		int l1;
		int l2;
		int l3;
		int re;
		for (i = 0;i < 3;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
		}
		l1 = String.valueOf(a[0]).length();
		l2 = String.valueOf(a[1]).length();
		l3 = String.valueOf(a[2]).length();
		int j;
		int k;
		int z = 0;
		int num = 0;
		int x = 0;
		int count = 0;
		for (j = 0;j < l1;j++)
		{
			if (a[0][j] == a[1][0])
			{
				z = j + 1;
				for (k = 1;k < l2;k++)
				{
					if (a[0][z] == a[1][k])
					{
						num++;
					}
					else
					{
						break;
					}
					z++;
				}
				if (num == l2 - 1)
				{
					re = 1;
					count = j;
				}
				else
				{
					continue;
				}
			}
			else if (re == 1)
			{
				break;
			}
			else
			{
				continue;
			}
		}
		if (re == 1)
		{
			for (i = count;i < l2 + count;i++)
			{
			   a[0][i] = a[2][x];
			   x++;
			}
			System.out.printf("%s",a[0]);
		}
		else
		{
			System.out.printf("%s",a[0]);
		}
	}
}

