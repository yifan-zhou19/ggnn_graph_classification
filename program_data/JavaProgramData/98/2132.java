package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[300][20];
		char c;
		int[] a = new int[300];
		int n;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			a[i] = 1 + String.valueOf(s[i]).length();
		}
		x = 0;
		for (i = 1;i < n;i++)
		{
			x = x + a[i];
			if (x <= 81 && x + a[i + 1] <= 81)
			{
				System.out.printf("%s ",s[i]);
			}
			if (x <= 81 && x + a[i + 1]>81)
			{
				System.out.printf("%s",s[i]);
			}
			if (x > 81)
			{
				System.out.print("\n");
				System.out.printf("%s ",s[i]);
				x = a[i];
			}
		}
		x = x + a[n];
		if (x <= 81)
		{
			System.out.printf("%s",s[n]);
		}
		if (x > 81)
		{
			System.out.printf("\n%s",s[n]);
		}
		return 0;
	}
}

