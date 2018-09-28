package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[201];
		String str = new String(new char[101]);
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i >= m != 0 && i < n)
			{
				a[i + n] = (a + i - m);
			}
			else
			{
				a[i + n] = (a + i + n - m);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
			System.out.printf(" %d",a[i + n]);
			}
			else
			{
				System.out.printf("%d",a[i + n]);
			}
		}
	}

}

