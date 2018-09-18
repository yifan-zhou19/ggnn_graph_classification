package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] num = new int[15];
		int j;
		int k;
		int i;
		int a = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[0] = Integer.parseInt(tempVar);
			}
			if (num[0] != -1)
			{
				i = 1;
				do
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i] = Integer.parseInt(tempVar2);
				}
					i++;
				}while (num[i - 1] != 0);
				for (j = 0;j < i;j++)
				{
					for (k = j + 1;k < i;k++)
					{
						if (num[k] == num[j] * 2 || num[j] == num[k] * 2)
						{
							a++;
						}
					}
				}
				System.out.printf("%d\n",a);
				a = 0;
			}
			else
			{
				break;
			}
		}



	}



}

