package <missing>;

public class GlobalMembers
{
	public static int cmp(Object e1, Object e2)
	{
		return *(int)e2 - (int)e1;
	}
	public static int Main()
	{
		int[][] a = new int[2][1000];
		int n;
		int i;
		int j;
		int i1;
		int i2;
		int j1;
		int j2;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int i1 = 0;
			int i2 = 0;
			int j1 = n - 1;
			int j2 = n - 1;
			if (n == 0)
			{
				break;
			}
			qsort(a[0],n,(Integer.SIZE / Byte.SIZE),cmp);
			for (i = 0;i < 2;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				qsort(a[i],n,(Integer.SIZE / Byte.SIZE),cmp);
			}
			int answer = 0;
			for (i = 0;i < n;i++)
			{
				if (a[0][j1] < a[1][j2])
				{
					answer -= 200;
					i2++;
					j1--;
				}
				else if (a[0][j1] > a[1][j2])
				{
					answer += 200;
					j2--;
					j1--;
				}
				else if (a[0][i1] < a[1][i2])
				{
					answer -= 200;
					i2++;
					j1--;
				}
				else if (a[0][i1] > a[1][i2])
				{
					answer += 200;
					i1++;
					i2++;
				}
				else
				{
					if (a[0][i1] == a[0][j1])
					{
						j1--;
						j2--;
					}
					else
					{
						answer -= 200;
						i2++;
						j1--;
					}
				}
			}
			System.out.print(answer);
			System.out.print("\n");
		}
		return 0;
	}
}

