package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] b = new int[1000];
		int m;
		char[][] a = new char[1000][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = tempVar2.charAt(0);
		}
		m = String.valueOf(a[0]).length();
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = tempVar3.charAt(0);
			}
			b[i] = String.valueOf(a[i]).length();
		}
		System.out.printf("%s",a[0]);
		for (i = 1;i < n;i++)
		{
			if (m + 1 + b[i] <= 80)
			{
				System.out.printf(" %s",a[i]);
				m = m + b[i] + 1;
			}
			else
			{
				System.out.printf("\n%s",a[i]);
				m = b[i];
			}
		}
		return 0;
	}
}

