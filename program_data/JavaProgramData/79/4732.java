package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[301];
	public static int[] b = new int[301];
	public static int select(int n, int m)
	{
		int tp = 0;
							 for (int i = 1;i <= n;i++)
							 {
									 b[i] = i;
									 a[i] = i;
							 } // give number
									 for (int i = 1;i <= n;i++)
									 {
									 tp = m % (n + 1 - i);
									 if (tp != 0)
									 {
										 for (int j = 1;j <= n - i - tp + 1;j++)
										 {
											 a[j] = b[j + tp];
										 }
												for (int j = n - i - tp + 2;j <= n - i;j++)
												{
													a[j] = b[j - (n - i - tp + 1)];
												}
									 }
												for (int j = 1;j <= n + 1 - i;j++)
												{
													b[j] = a[j];
												}
									 }

									 return a[1];
	}



	public static int Main()
	{
		int n;
		int m;
	 while (true)
	 {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m == 0 && n == 0)
		{
			break;
		}
		System.out.printf("%d\n",select(n, m));
	 }
	}

}

