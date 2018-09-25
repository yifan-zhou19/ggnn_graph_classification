package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int j;
		int k;
		int t;
		int b;
		int c;
		int d;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		for (i = 1;i <= n;i++)
		{
			k = 0;
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 b = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 c = Integer.parseInt(tempVar3);
				 }
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 d = Integer.parseInt(tempVar4);
				 }
				 if (c > d)
				 {
					 j = c;
					 c = d;
					 d = j;
				 }

				 for (j = c;j < d;j++)
				 {
					 k = k + days[j];
					 if ((j == 2) && (((b % 4 == 0) && (b % 100 != 0)) || (b % 400 == 0)))
					 {
						 k++;
					 }
				 }
				 if (k % 7 == 0)
				 {
					 System.out.print("YES\n");
				 }
				 else
				 {
					 System.out.print("NO\n");
				 }
		}
		return 0;
	}

}

