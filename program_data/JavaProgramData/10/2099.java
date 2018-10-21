package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] h = new int[100];
		int ans;
		while (scanf("%d", n) != EOF)
		{
			  ans = 1;
			  for (int i = 0; i < n; i++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a[i] = Integer.parseInt(tempVar);
				  }
				  h[i] = 1;
			  }
			  for (int i = 1; i < n; i++)
			  {
				  int sum = 1;
				  for (int j = 0; j < i; j++)
				  {
					  if (a[j] >= a[i] != 0 && h[i] < h[j] + 1)
					  {
						 h[i] = h[j] + 1;
					  }
				  }
				  if (h[i] > ans)
				  {
					  ans = h[i];
				  }
			  }
			  System.out.printf("%d\n", ans);
		}
		return 0;
	}

}

