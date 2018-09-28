package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l = 0;
		int s = 100;
		int p;
		char[][] a = new char[200][100];
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
			p = String.valueOf(a[i]).length();
			if (p > l)
			{
				l = p;
			}
			if (p < s)
			{
				s = p;
			}
		}
		for (i = 0;i < n;i++)
		{
			p = String.valueOf(a[i]).length();
			if (p == l)
			{
				System.out.println(a[i]);
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			p = String.valueOf(a[i]).length();
			if (p == s)
			{
				System.out.println(a[i]);
				break;
			}
		}
		return 0;
	}
}

