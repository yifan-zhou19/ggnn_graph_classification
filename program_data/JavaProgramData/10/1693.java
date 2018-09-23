package <missing>;

public class GlobalMembers
{
	/*
	La vie est ailleurs
	PROB: Missile Defense
	LANG: c
	ID: 00910049
	written by Xu Zhendong
	*/


	public static int k;

	public static int Main()
	{
		int Max = new int(int a, int b);
		int[] height = new int[100];
		int[] dp = new int[100];
		char c;
		int i = 0;
		int temp = 0;
		int n;
		int j;
		int dpmax = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		n = n - 1;
		for (i = 0;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				height[i] = Integer.parseInt(tempVar2);
			}
		}
		/*while ( ( c = getchar() ) != '\n')
		{
		      if ( c != ' ' ) temp = temp * 10 + ( c - '0' );
		      else 
		      {
		           height[i++] = temp; 
		           temp = 0;
		      }
		}
		height[i] = temp;
		n = i ;*/

		for (i = 0; i <= n; i++)
		{
			dp[i] = 1;
			for (j = 0; j < i; j++)
			{
				if (height[i] <= height[j])
				{
					dp[i] = Max(dp[j] + 1, dp[i]);
				}
			}
		}
		for (i = 0; i <= n; i++)
		{
			dpmax = Max(dpmax, dp[i]);
		}
		System.out.printf("%d",dpmax);
		return 0;
	}
		public static int Max(int a, int b)
		{
			k = (a < b != 0 ? b : a);
			return (k);
		}

}

