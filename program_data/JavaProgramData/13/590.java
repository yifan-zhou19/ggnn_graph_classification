package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[20000];
		int[] a = new int[100];
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
			s[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < 100;i++)
		{
		a[i] = 0;
		}
		System.out.printf("%d",s[0]);
		a[s[0]] = 1;
		for (i = 1;i < n;i++)
		{
		if (a[s[i]] == 0)
		{
			System.out.printf(" %d",s[i]);
			a[s[i]] = 1;
		}
		}
		return 0;
	}
}

