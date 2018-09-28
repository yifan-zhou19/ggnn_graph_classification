package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] s = new int[1000];
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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

		for (i = 0;i < n - m;i++)
		{
			s[i + n] = s[i];
		}

		for (i = n - m;i < 2 * n - m - 1;i++)
		{
			System.out.printf("%d ",s[i]);
		}
		System.out.printf("%d",s[2 * n - m - 1]);
	}
}

