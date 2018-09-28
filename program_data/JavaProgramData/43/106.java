package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[1000];
		int s = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i < m;i++)
		{
						for (j = 2;j <= Math.sqrt(i);j++)
						{
											   if (i % j == 0)
											   {
											   break;
											   }
						}
						if (j > Math.sqrt(i))
						{
							a[s] = i;
							s = s + 1;
						}
		}
		for (i = 0;i < s - 1;i++)
		{
						for (j = s - 1;j >= i;j--)
						{
										  if (a[i] + a[j] == m)
										  {
										  System.out.printf("%d %d\n",a[i],a[j]);
										  }
						}
		}
		System.in.read();
		System.in.read();
	}


}

