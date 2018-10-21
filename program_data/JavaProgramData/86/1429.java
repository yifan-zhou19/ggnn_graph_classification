package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int m;
		 int i;
		 int k;
		 int sum;
		 int sum1;
		 int cs;
		 int[] js = new int[20];
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
				if (m == 0)
				{
					System.out.print("60\n");
				}
				else
				{
					for (k = 0;k < m;k++)
					{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							js[k] = Integer.parseInt(tempVar3);
						}
					}
					sum = 0;
					for (k = 0;k < m;k++)
					{
						sum1 = sum;
						sum = js[k] + 3 * (k + 1);
						if (sum > 60)
						{
							break;
						}
					}
					if (sum < 60)
					{
						cs = js[m - 1] + 60 - sum;
					}
					else if (sum >= 60 && sum <= 63)
					{
						cs = js[k];
					}
					else if (sum > 63)
					{
						cs = js[k - 1] + 60 - sum1;
					}
					System.out.printf("%d\n",cs);
				}
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 n = Integer.parseInt(tempVar4);
		 }
		return 0;
	}

}

