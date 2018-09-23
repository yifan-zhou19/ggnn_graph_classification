package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int num;
		int flag;
		while (true)
		{
			flag = 0; //flag????????0
			i = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1) //??????????????????????
			{
				break;
			}
			else
			{
				do
				{
					i++;
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
				}while (a[i] != 0); //????????
				num = i; //num???????????
				for (i = 0;i < num;i++)
				{
					for (j = i + 1;j < num;j++)
					{
						if ((a[i] == 2 * a[j]) || (a[j] == 2 * a[i]))
						{
							flag++;
						}
					}
				}
				System.out.printf("%d\n",flag);
			}
		}
		return 0;
	}



}

