package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] m = new int[100];
		int t = 0;
		int j;
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
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n / 2;i++)
		{
			j = n - i - 1;
			t = m[i];
			m[i] = m[j];
			m[j] = t;
		}
		System.out.printf("%d",m[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",m[i]);
		}
		return 0;
	}
}

