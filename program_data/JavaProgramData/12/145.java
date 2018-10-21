package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] str = new int[20];
		int doubl;
		int num = 0;
		int a;
		int b;
		int c;
		while (true)
		{
			num = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[0] = Integer.parseInt(tempVar);
			}
			if (str[0] == -1)
			{
				break;
			}
			else
			{
				for (a = 1;str[a - 1] != 0;a++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						str[a] = Integer.parseInt(tempVar2);
					}
				}
			}
				for (b = 0;b < a - 1;b++)
				{
					doubl = 2 * str[b];
					for (c = 0;c < a - 1;c++)
					{
						if (str[c] == doubl)
						{
							num++;
						}
						else
						{
							num = num;
						}
					}
				}
					System.out.printf("%d\n",num);
		}
				return 1;
	}
}

