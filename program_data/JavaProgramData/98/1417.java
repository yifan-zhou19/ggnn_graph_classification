package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		char[][] a = new char[1000][41];
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
				a[i] = tempVar2.charAt(0);
			}
		}
		len = String.valueOf(a[0]).length();
		System.out.printf("%s",a[0]);
		for (i = 1;i < n;i++)
		{
			len += 1 + String.valueOf(a[i]).length();
			if (len <= 80)
			{
				System.out.printf(" %s",a[i]);
			}
			if (len > 80)
			{
				System.out.printf("\n%s",a[i]);
				len = String.valueOf(a[i]).length();
			}
		}
		return 0;
	}
}

