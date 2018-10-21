package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m;
		int[] a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		a = new int[n + m];
		a += m;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a++ = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			a--,*(a - n) = a[0];
		}
		a -= n;
		n--;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n]);
	}


}

