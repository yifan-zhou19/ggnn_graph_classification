package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_hight = new int[25];
int[] num = new int[25];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int hight[25],num[25];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				Main_hight[i] = Integer.parseInt(tempVar2);
			}
		}
		num[0] = 1;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i - 1;j >= 0;j--)
			{
				m = 0;
				if (Main_hight[j] >= Main_hight[i])
				{
					m = num[j];
					break;
				}
			}
			if (j == -1)
			{
				num[i] = 1;
			}
			for (k = j - 1;k >= 0;k--)
			{
				if (Main_hight[k] >= Main_hight[i])
				{
					if (num[k] > m)
					{
						m = num[k];
					}
				}
			}
			if (num[i] == 0)
			{
				num[i] = m + 1;
			}
		}
		max = num[n - 1];
		for (i = n - 2;i >= 0;i--)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}



}

