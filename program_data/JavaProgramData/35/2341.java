package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hang;
		int lie;
		int[][] shuzu = new int[8][8];
		int i;
		int k;
		int number;
		int shu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hang;i++)
		{
						   for (k = 0;k < lie;k++)
						   {
											   String tempVar3 = ConsoleInput.scanfRead();
											   if (tempVar3 != null)
											   {
												   shuzu[i][k] = Integer.parseInt(tempVar3);
											   }
						   }
		}
		for (i = 0;i < hang;i++)
		{
							number = 0;
							for (k = 0;k < lie;k++)
							{
											   if (shuzu[i][k] > shuzu[i][number])
											   {
																				number = k;
											   }
							} //????????????
							for (int j = 0;j < hang;j++)
							{
									if (shuzu[i][number] > shuzu[j][number])
									{
																		  break; //????????????????????
									}
									else
									{
										  if (j == hang - 1)
										  { //???????????????????break?
														System.out.printf("%d+%d\n",i,number);
														shu++;
														break;
										  }
										  continue;
									}
							}
		}
		if (shu == 0)
		{
				   System.out.print("No");
		}
		return 0;
	}
}

