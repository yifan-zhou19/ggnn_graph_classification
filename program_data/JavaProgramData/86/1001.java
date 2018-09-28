package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int flag = 0;
		int a;
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
				m = Integer.parseInt(tempVar2);
			}
			int[] shzu = new int[m];
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shzu[j] = Integer.parseInt(tempVar3);
				}
			}
			if (m == 0)
			{
				System.out.printf("%d\n",60);
			}
			else
			{
				for (j = m - 1;j >= 0;j--)
				{
					flag = 0;
					if ((shzu[j] + 3 * j <= 60) && ((60 - 3 * j - shzu[j]) <= 3))
					{
						a = shzu[j];
						flag = 1;
					}
					if ((60 - 3 * j - shzu[j]) > 3)
					{
						a = 60 - 3 * (j + 1);
						flag = 1;
					}
					if (flag == 1)
					{
						System.out.printf("%d\n",a);
						break;
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(shzu);
		}
		return 0;
	}
}

