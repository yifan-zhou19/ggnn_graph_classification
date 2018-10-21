package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int hang;
		int lie;
		(int)(*a)[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int [100])malloc(100 * 100 * (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(*(a + i) + j) = tempVar3;
				}
			}
		}
		if (hang <= lie)
		{
			for (j = 0;j < hang;j++)
			{
				for (i = j,k = 0;i != -1;i--,k++)
				{
					System.out.printf("%d\n",*(*(a + k) + i));
				}
			}
			for (j = hang;j < lie;j++)
			{
				for (i = j,k = 0;k != hang;i--,k++)
				{
					System.out.printf("%d\n",*(*(a + k) + i));
				}
			}
			for (j = 1;j < hang;j++)
			{
				for (k = j,i = lie-1;k < hang;k++,i--)
				{
					System.out.printf("%d\n",*(*(a + k) + i));
				}
			}
		}
		else
		{
				for (j = 0;j < lie;j++)
				{
					for (i = j,k = 0;i >= 0;i--,k++)
					{
						System.out.printf("%d\n",*(*(a + k) + i));
					}
				}

				for (j = lie;j < hang;j++)
				{
					for (i = lie-1,k = j - lie+1;i >= 0;i--,k++)
					{
					System.out.printf("%d\n",*(*(a + k) + i));
					}
				}

				for (j = hang - lie+1;j < hang;j++)
				{
						for (k = j,i = lie-1;k < hang;k++,i--)
						{
					  System.out.printf("%d\n",*(*(a + k) + i));
						}
				}
		}
	}

}

