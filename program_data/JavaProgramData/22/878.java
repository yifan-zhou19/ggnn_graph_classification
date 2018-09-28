package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int n = 0;
		int k = 1;
		int m;
		char p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		while (p == ',')
		{
			k++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				p = tempVar4.charAt(0);
			}
		}
		if (k == 1)
		{
			System.out.print("No");
		}
		else
		{
			m = a[1];
			for (i = 2;i <= k;i++)
			{
				if (m < a[i])
				{
					m = a[i];
				}
			}
			for (i = 1;i <= k;i++)
			{
				if (a[i] > n && a[i] != m)
				{
					n = a[i];
				}
			}
			if (n == 0)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",n);
			}
		}
		return 0;
	}
}

