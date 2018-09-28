package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		for (i = 0;;i++)
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
					 if (n == 0 && m == 0)
					 {
						 break;
					 }
						int huo;
						int shu;
						huo = n;
						shu = 1;
						int k;
						int[] a = new int[1000];
						for (k = 1;k <= n;k++)
						{
							 a[k] = 1;
						}
						while (huo > 1)
						{
									if (k > n)
									{
									  k = 1;
									}
									if (a[k] == 1)
									{
											   if (shu % m == 0)
											   {
												   a[k] = 0;
												   huo--;
											   }
											   shu++;
									}
									k++;
						}
						int l;
						for (l = 1;l <= n;l++)
						{
						if (a[l] == 1)
						{
						System.out.printf("%d\n",l);
						}
						}
		}
	}

}

