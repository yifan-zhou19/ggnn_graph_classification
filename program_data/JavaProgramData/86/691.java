package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j = 0;
		int k;
		int nomean;
		int time1;
		int time2;
		int T1;
		int T2;
		int T;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			time2 = 0;
			T1 = 0;
			T2 = 0;
			j = 0;
			if (m != 0)
			{ //????60s???
					do
					{
							 time1 = time2;
							 T1 = T2;
							 String tempVar3 = ConsoleInput.scanfRead();
							 if (tempVar3 != null)
							 {
								 T2 = Integer.parseInt(tempVar3);
							 }
							 j++;
							 time2 = T2 + j * 3;
					}while (j < m && time2 < 60);

			}
			if ((m - j) != 0)
			{
				for (k = 0;k < m - j;k++)
				{
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  nomean = Integer.parseInt(tempVar4);
				  }
				}
			}
			if (time2 <= 60)
			{
			   T = 60 - 3 * m;
			}
			else if (time2 <= 63)
			{
			   T = T2;
			}
				 else
				 {
				  T = T1 + (60 - time1);
				 }
			 System.out.printf("%d\n",T);
		}
		return 0;
	}
}

