package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int[] s = new int[100];
		int i;
		int[] c = new int[100];
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
				s[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1;i >= n - m;i--)
		{
			c[i] = s[i];
		}
		for (i = 0;i < n - m;i++)
		{
			s[n - 1 - i] = s[n - m - 1 - i];
		}
		for (i = 0;i < m;i++)
		{
			s[i] = c[n - m + i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",s[i]);
		}
		System.out.printf("%d",s[n - 1]);
	}


}

