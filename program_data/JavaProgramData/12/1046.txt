package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a = 1;
		int i = 0;
		int j;
		int k;
		int n = 0;
		int zs = 0;
		int[] num = new int[15];
		while (a != -1)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			if (a != 0)
			{
				num[i] = a;
				n++;
				i++;
			}
			else
			{
				for (j = 0;j < n;j++)
				{
					for (k = 0;k < n;k++)
					{
						if (num[j] == 2 * num[k])
						{
							zs++;
						}
					}
				}
				System.out.printf("%d\n",zs);
				i = 0;
				n = 0;
							   zs = 0;
			}
		}

	}
}

