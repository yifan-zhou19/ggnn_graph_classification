package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][40];
		int i;
		int n;
		int m;
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
		m = String.valueOf(a[0]).length();
		System.out.printf("%s",a[0]);
		for (i = 1;i < n;i++)
		{
			m = m + String.valueOf(a[i]).length() + 1;
			if (m <= 80)
			{
				System.out.printf(" %s",a[i]);
			}
			else
			{
				m = String.valueOf(a[i]).length();
				System.out.printf("\n%s",a[i]);
			}
		}
	}
}

