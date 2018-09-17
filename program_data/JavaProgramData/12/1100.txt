package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shuzu = new int[16];
		int i;
		int t;
		int k;
		int num = 0;

		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				shuzu[i] = Integer.parseInt(tempVar);
			}
			if (shuzu[i] == -1)
			{
				break;
			}
			if (shuzu[i] == 0)
			{

				for (t = 0;t < i;t++)
				{
					for (k = t + 1;k < i;k++)
					{
						if (shuzu[t] == shuzu[k] * 2 || shuzu[t] * 2 == shuzu[k])
						{
							num++;
						}

					}
				}
				System.out.printf("%d\n",num);
				num = 0;
				i = -1;
			}


		}

		return 0;
	}

}

