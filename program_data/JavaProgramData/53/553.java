package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] num = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			int s = 0;
			for (j = i + 1;j < n;j++) //??num[i]????????
			{
				if (num[i] == num[j])
				{
					s = s + 1;
				}
			}
			if (s != 0) //????????????
			{
				int t = 0;
				for (k = 0;k <= i;k++)
				{
					if (num[i] == num[k])
					{
						t = t + 1;
					}
				}
				if (t <= 1) //????
				{
					if (i == 0)
					{
						System.out.printf("%d",num[i]);
					}
					else
					{
						System.out.printf(",%d",num[i]);
					}
				}
			}
			else //????
			{
				int t = 0;
				for (k = 0;k <= i;k++)
				{
					if (num[i] == num[k])
					{
						t = t + 1;
					}
				}
				if (t == 1)
				{
					if (i == 0)
					{
						System.out.printf("%d",num[i]);
					}
				else
				{
					System.out.printf(",%d",num[i]);
				}
				}
			}
		}
	}

}

