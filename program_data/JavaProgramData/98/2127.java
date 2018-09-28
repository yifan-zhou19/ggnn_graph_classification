package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[1000];
		int x = 0;
		char[][] s = new char[1000][40];
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
		for (i = 1;i < n;i++)
		{
			x = x + a[i];
			if (x <= 81)
			{
				if ((x + a[i + 1]) <= 81)
				{
					System.out.printf("%s ",s[i]);
				}
				else
				{
					System.out.printf("%s",s[i]);
				}
			}
			else
			{
				System.out.print("\n");
				x = a[i];
				System.out.printf("%s ",s[i]);
			}
		}
		if ((x + a[n]) <= 81)
		{
			System.out.printf("%s",s[n]);
		}
		else
		{
			System.out.printf("\n%s",s[n]);
		}
		return 0;
	}
}

