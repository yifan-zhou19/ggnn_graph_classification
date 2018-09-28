package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
		int counter = 0;
		int[] a = new int[50000];
		int[] s = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1;
		}
		s[0] = 2;
		for (i = 2;i < n;i++) //????????
		{
						for (j = 2;j < i + 1;j++)
						{
										  if (j == i)
										  {
												  if (a[i] % 2 == 1)
												  {
												 s[k] = a[i];
												  }
												 k++;
										  }
										   if (a[i] % j == 0)
										   {
											   break;
										   }
						}
		}
		for (i = 0;i < k - 1;i++)
		{
						for (j = i;j < k;j++)
						{
										if (s[i] + s[j] == n)
										{
										System.out.printf("%d %d\n",s[i],s[j]);
										}
						}
		}

	}

}

