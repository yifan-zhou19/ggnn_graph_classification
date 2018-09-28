package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int len;
		int[] b = new int[300];
		int[] ans = new int[300];
		String z = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = tempVar.charAt(0);
		}
		len = z.length();
		for (i = 0;i < len;i++)
		{
			a[len - 1 - i] = z.charAt(i) - '0';
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		len = z.length();
		for (i = 0;i < len;i++)
		{
			b[len - 1 - i] = z.charAt(i) - '0';
		}
		for (i = 0;i < 300;i++)
		{
			ans[i] = a[i] + b[i];
		}

		for (i = 0;i < 300;i++)
		{
			if (ans[i] >= 10)
			{
				ans[i + 1] = ans[i + 1] + (ans[i] / 10);
				ans[i] = ans[i] % 10;
			}
		}
		int mid = 0;
		for (i = 299;i > -1;i--)
		{
			if (ans[i] != 0)
			{
				mid = 1;
			}
			if (mid == 1)
			{
				System.out.printf("%d",ans[i]);
			}
		}
		if (mid == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		return 0;
	}


}

