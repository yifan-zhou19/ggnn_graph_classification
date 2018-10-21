package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int num;
	int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (c = 0;c < n;c++)
		{
		int m;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m == 0)
		{
			num = 60;
			System.out.printf("%d\n",num);
		}
		else
		{
		int[] shuzu = new int[m];
		for (a = 0;a < m;a++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   shuzu[a] = Integer.parseInt(tempVar3);
		   }
		}
		if (shuzu[m - 1] > 60 - 3 * (m - 1) - 1)
		{
			int b = m - 2;
			int i;
			for (i = b;i >= 0;i--)
			{
				if (shuzu[i] > 60 - 3 * i - 1)
				{
					continue;
				}
				if ((shuzu[i] <= 60 - 3 * i - 1) && (shuzu[i]>60 - 3 * i - 3))
				{
					num = shuzu[i];
					break;
				}
				if (shuzu[i] <= 60 - 3 * i - 3)
				{
					num = 60 - 3 * i - 3;
					break;
				}
			}
		}

		if ((shuzu[m - 1] <= 60 - 3 * (m - 1) - 1) && (shuzu[m - 1]>60 - 3 * (m - 1) - 3))
		{
			num = shuzu[m - 1];
		}
		if (shuzu[m - 1] <= 60 - 3 * (m - 1) - 3)
		{
			num = 60 - 3 * (m - 1) - 3;
		}

		System.out.printf("%d\n",num);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(shuzu);
		}
		}

		return 0;
	}

}

