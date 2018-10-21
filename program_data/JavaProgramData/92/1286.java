package <missing>;

public class GlobalMembers
{
	public static void line(int n, int p[] p)
	{
		 int i;
		 int j;
		 int k;
		 for (i = 0;i < n;i++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 p[i] = Integer.parseInt(tempVar);
			 }
		 }
		 for (i = 0;i < n - 1;i++)
		 {
						 for (j = 0;j < n - 1 - i;j++)
						 {
										   if (p[j] > p[j + 1])
										   {
														  k = p[j];
														  p[j] = p[j + 1];
														  p[j + 1] = k;
										   }
						 }
		 }
	}
	public static int Main()
	{
		int n;
		int n1;
		int i;
		int j;
		int k;
		int t;
		int l;
		int sum;
		int s;
		int win;
		int w;
		int lose;
		int money;
		int flag;
		int flag2;
		int[] a = new int[1000];
		int[] b = new int[1000];
		for (l = 0;;l++)
		{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							n1 = Integer.parseInt(tempVar);
						}
						if (n1 == 0)
						{
							break;
						}
						lose = 0;
						win = 0;
						i = j = 0;
						k = l = n1 - 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						memset(a,0,1000 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
						memset(b,0,1000 * (Integer.SIZE / Byte.SIZE));
					   line(n1, a);
					   line(n1, b);
					   while (j <= k != 0 && i <= l)
					   {
						 if (b[j] < a[i])
						 {
									  win++;
									  i++;
									  j++;
						 }
						 else if (b[j] > a[i])
						 {
							  lose++;
							  i++;
							  k--;
						 }
						 else
						 {
							 if (b[k] < a[l])
							 {
										  win++;
										  k--;
										  l--;
							 }
							 else if (b[k] > a[i])
							 {
								  lose++;
								  k--;
								  i++;
							 }
							 else
							 {
								  k--;
								  i++;
							 }
						 }
					   }
					  money = 200 * win - 200 * lose;
					  System.out.printf("%d\n",money);
		}
		return 0;
	}
}

