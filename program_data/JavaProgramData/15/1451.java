package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] shu = new int[1000][1000];
		int i;
		int k;
		int heng = 0;
		int s = 0;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						for (k = 0;k < n;k++)
						{
										String tempVar2 = ConsoleInput.scanfRead();
										if (tempVar2 != null)
										{
											shu[i][k] = Integer.parseInt(tempVar2);
										}

						}
		}
		 for (i = 0;i < n;i++)
		 {
						 for (k = 0;k < n;k++)
						 {
										 if (shu[i][k] == 0)
										 {
														   heng += 1;
										 }
						 }
						  if (heng != 0)
						  {
									 break;
						  }
		 }
		 for (k = 0;k < n;k++)
		 {
						 for (i = 0;i < n;i++)
						 {
										 if (shu[i][k] == 0)
										 {
														 s += 1;
										 }
						 }
						 if (s != 0)
						 {
								   break;
						 }
		 }
		count = (s - 2) * (heng - 2);
		System.out.printf("%d",count);
		return 0;
	}




}

