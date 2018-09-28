package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ans;
		int i;
		int N;
		int y;
		int a;
		int b;
		int[] sum1 = new int[13];
		int[] sum2 = new int[13];
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		sum1[0] = sum2[0] = 0;
		for (i = 1;i <= 12;i++)
		{
			sum1[i] = sum1[i - 1] + mon[i];
			sum2[i] = sum2[i - 1] + mon[i];
			if (i == 2)
			{
				sum2[i]++;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		while (N-- != 0)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   y = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   b = Integer.parseInt(tempVar4);
		   }
		   ans = 0;
		   if (a > b)
		   {
			   a ^= b;
			   b ^= a;
			   a ^= b;
		   }
		   if ((y % 100 == 0 && y % 400 == 0) || (y % 100 && y % 4 == 0))
		   {
			   ans = (sum2[b - 1] - sum2[a - 1]) % 7;
		   }
		   else
		   {
			   ans = (sum1[b - 1] - sum1[a - 1]) % 7;
		   }

			if (ans == 0)
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

