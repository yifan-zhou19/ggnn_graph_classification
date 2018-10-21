package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int jiaohuan = new int(int s[5],int n,int m);
		int i;
		int j;
		int n;
		int m;
		int[][] shuzu = new int[5][5];
		(int)(*s)[5] = shuzu;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(*(s + i) + j) = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (jiaohuan(s, n, m) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",*(*(s + i) + j));
					}
					else
					{
						System.out.printf(" %d",*(*(s + i) + j));
					}
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
	public static int jiaohuan(int[] s, int n, int m)
	{
		int i;
		int temp;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				temp = (s[n] + i);
				*(s[n] + i) = *(s[m] + i);
				*(s[m] + i) = temp;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

