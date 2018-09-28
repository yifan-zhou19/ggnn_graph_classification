package <missing>;

public class GlobalMembers
{
	public static int tiaosheng(int m, int[] a)
	{
		int i;
		int n;
		for (i = m - 1;i >= 0;i--)
		{
						if ((a[i] + 3 * (i + 1)) <= 60)
						{
											  n = 60 - 3 * (i + 1);
											  break;
						}
						else if ((a[i] + 3 * i) <= 60)
						{
												n = a[i];
												break;
						}
		}
		return n;
	}
	public static int Main()
	{
		int[] a;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
					   // k=l=0;
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
					   if (m == 0)
					   {
							   System.out.print("60\n");
							   continue;
					   }
						a = new int[m];
						for (j = 0;j < m;j++)
						{
							String tempVar3 = ConsoleInput.scanfRead();
							if (tempVar3 != null)
							{
								a[j] = Integer.parseInt(tempVar3);
							}
						}
						System.out.printf("%d\n",tiaosheng(m, a));
		}
		return 0;
	}
}

