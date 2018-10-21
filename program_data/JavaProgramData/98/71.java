package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int k;
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			if (k == 0)
			{
				System.out.printf("%s",s);
				k = l;
				continue;
			}
			if (k + l < 80)
			{
				System.out.printf(" %s",s);
				k = k + l + 1;
				continue;
			}
			if (k + l >= 80)
			{
				System.out.printf("\n%s",s);
				k = l;
				continue;
			}
		}
		return 0;
	}
}

