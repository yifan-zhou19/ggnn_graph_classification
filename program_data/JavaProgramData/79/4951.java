package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sn = new int[1000];
		int[] sm = new int[1000];
		int NUM = 0;
		for (int p = 0;p < 1000;p++)
		{
			int a1;
			int a2;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a1 = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a2 = Integer.parseInt(tempVar2);
			}
			if ((a1 == 0) && (a2 == 0))
			{
				break;
			}
			else
			{
				sn[p] = a1;
				 sm[p] = a2;
				 NUM++;
			}
		}
		int k = 1;
		for (int t = 0;t < NUM;t++)
		{
		   for (int i = 1;i <= sn[t];i++)
		   {
			   k = (k + sm[t] - 1) % i + 1;
		   }
			   System.out.printf("%d\n",k);
		}
		return 0;
	}
}

