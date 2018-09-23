package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num;
		int[] e = new int[20001];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   num = Integer.parseInt(tempVar2);
			   }
			   System.out.printf("%d",num);
		}
		else
		{
			   for (i = 1;i <= n;++i)
			   {
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 num = Integer.parseInt(tempVar3);
						 }
						 e[i] = num;
						 if (i == 1)
						 {
								 System.out.printf("%d",e[1]);
						 }
						 else
						 {
								for (j = 1;j < i;j++)
								{
										  if (e[i] == e[j])
										  {
											 e[i] = 0;
												   break;
										  }
								}
														if (e[i] != 0)
														{
																   System.out.printf(" %d",e[i]);
														}
						 }
			   }
		}
																   return 0;
	}
}

