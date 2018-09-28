package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int l0 = 0;
		int l1 = 50;
		int p;
		int q;
		char[][] a = new char[200][50];
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
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(a[i]).length();
			if (l > l0)
			{
				l0 = l;
				p = i;
			}
			if (l < l1)
			{
				l1 = l;
				q = i;
			}
		}
		System.out.printf("%s\n",a[p]);
		System.out.printf("%s",a[q]);
		return 0;
	}


}

