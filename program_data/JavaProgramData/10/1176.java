package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[26];
		int[] b = new int[26];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		}
		b[0] = 1;
		k = 1;
		for (j = 1;j < n;j++)
		{
						b[j] = 1;
						for (i = 0;i < j;i++)
						{
										if (a[i] >= a[j])
										{
													  if (b[i] + 1 > b[j])
													  {
														  b[j] = b[i] + 1;
													  }
										}
						}
						if (b[j] > k)
						{
							k = b[j];
						}
		}
		System.out.printf("%d\n",k);
		return 0;
	}
}

