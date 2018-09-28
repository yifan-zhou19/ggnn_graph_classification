package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
						 int m;
						 int[] a = new int[100];
						 int i;
						 int j;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 m = Integer.parseInt(tempVar2);
						 }
						 if (m != 0)
						 {
							for (i = 1;i <= m;i++)
							{
									String tempVar3 = ConsoleInput.scanfRead();
									if (tempVar3 != null)
									{
										a[i] = Integer.parseInt(tempVar3);
									}
							}
							for (j = 1;j <= m;j++)
							{
											 if (j < m)
											 {
													if ((a[j] + 3 * j <= 60) && (a[j + 1] + 3 * j >= 63))
													{
													 System.out.printf("%d\n",60 - 3 * j);
													 break;
													}
													 else if (a[j] + 3 * j == 61 || a[j] + 3 * j == 62)
													 {
													 System.out.printf("%d\n",a[j]);
													 break;
													 }
											 }
											 else
											 {
												  if (a[j] + 3 * j < 60)
												  {
												  System.out.printf("%d\n",60 - 3 * j);
												  break;
												  }
												   else if (a[j] + 3 * j == 63 || a[j] + 3 * j == 61 || a[j] + 3 * j == 62)
												   {
												   System.out.printf("%d\n",a[j]);
													break;
												   }
											 }
							}
						 }
							else
							{
								System.out.print("60\n");
							}
		}
	}
}

