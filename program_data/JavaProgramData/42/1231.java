package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (int j = 0;x + y != n;j++)
		{
				if (a[j] == k)
				{
						   for (int i = j;i < (n - x);i++)
						   {
								   a[i] = a[i + 1];
						   }
						   x++;
						   j--;
				}
				else
				{
				y++;
				}
		}
		System.out.printf("%d",a[0]);
		for (int i = 1;i < (n - x);i++)
		{
		System.out.printf(" %d",a[i]);
		}
		System.in.read();
		System.in.read();
	}

}

