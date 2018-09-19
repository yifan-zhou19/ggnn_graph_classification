package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[200];
		int k;
		int i;
		int n = 0;
		int j = 0;
			   for (i = 0;i < 200;i++)
			   {
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] != -1 && a[i] != 0)
				{
					n = n + 1;
				}
				if (a[i] == -1)
				{
					break;
				}
				if (a[i] == 0)
				{
						for (k = 0;k < n;k++)
						{
							for (i = 0;i < n;i++)
							{
								if (a[k] == 2 * a[i])
								{
								j = j + 1;
								}
							}
						}
						System.out.printf("%d\n",j);
						j = 0;
						i = -1;
						n = 0;
				}
			   }
	}
}

