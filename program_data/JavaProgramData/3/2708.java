package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a;
		int i;
		int j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
						for (j = i + 1;j < n;j++)
						{
										  if (a[i] + a[j] == k)
										  {
											  System.out.print("yes");
										  flag = 1;
										  break;
										  }
						}
						if (flag == 1)
						{
							break;
						}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

