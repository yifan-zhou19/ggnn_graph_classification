package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] shuzu = new int[16];
		int i;
		int j;
		int pair = 0;
		int n;
			for (i = 0;shuzu[0] != -1;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					shuzu[i] = Integer.parseInt(tempVar);
				}
				if (shuzu[i] == 0)
				{
					n = i;
					for (i = 0;i < n;i++)
					{
						for (j = 0;j < n;j++)
						{
							if (shuzu[i] == 2 * shuzu[j])
							{
								pair++;
							}
						}
					}
					System.out.printf("%d\n",pair);
					i = -1;
					pair = 0;
				}
			}
	}

}

