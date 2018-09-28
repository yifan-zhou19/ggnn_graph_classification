package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		int i;
		int k;
		int[] a = new int[100000];
		int[] b = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				b[i] = 0;
			}
			else
			{
				b[i] = 1;
				s = s + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 1)
			{
				if (s == 1)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf("%d ",a[i]);
					s = s - 1;
				}
			}
		}
		return 0;
	}

}

