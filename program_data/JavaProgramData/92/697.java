package <missing>;

public class GlobalMembers
{
	public static int bijiao(Object x, Object y)
	{
		return *(int)y - (int)x;
	}
	public static int Main()
	{
		while (true)
		{
			int n;
			int i;
			int j = 0;
			int k;
			int temp = 0;
			int sum = 0;
			int tmax = 0;
			int tmin;
			int qmax = 0;
			int qmin;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
			return 0;
			}
			else
			{
				int[] a = new int[1001];
				int[] b = new int[1001];
			   for (i = 0;i < n;i++)
			   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
			   }
			   for (i = 0;i < n;i++)
			   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b[i] = Integer.parseInt(tempVar3);
			   }
			   }
			   qsort(a,n,(Integer.SIZE / Byte.SIZE),bijiao);
			   qsort(b,n,(Integer.SIZE / Byte.SIZE),bijiao);
			   tmin = n - 1;
			   qmin = n - 1;
			   for (i = 0;i < n;i++)
			   {
				if (a[tmax] > b[qmax])
				{
					temp++;
					tmax++;
					qmax++;
				}
				else
				{
					if (a[tmax] < b[qmax])
					{
						temp--;
						tmin--;
						qmax++;
					}
					else
					{
						if (a[tmin] > b[qmin])
						{
							temp++;
							tmin--;
							qmin--;
						}
						else
						{
							if (a[tmin] < b[qmin])
							{
								temp--;
								tmin--;
								qmax++;
							}
							else
							{
								if (a[tmin] < b[qmax])
								{
									temp--;
									tmin--;
									qmax++;
								}
								else
								{
								if (a[tmin] == b[qmax])
								{
								break;
								}
								}
							}
						}
					}
				}
			   }
				System.out.printf("%d\n",temp * 200);
			}
		}
	}
}

