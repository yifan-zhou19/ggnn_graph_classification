package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		int i;
		int j;
		int n;
		int t;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0; j < n; j++)
		{
			t = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (i = 0; i < l; i++)
			{
				if (a.charAt(0) < 'A')
				{
					t++;
				}
				if (a.charAt(i) < '0')
				{
					t++;
				}
				if (a.charAt(i) > '9' && a.charAt(i) < 'A')
				{
					t++;
				}
				if (a.charAt(i) > 'Z' && a.charAt(i) < '_')
				{
					t++;
				}
				if (a.charAt(i) > '_' && a.charAt(i) < 'a')
				{
					t++;
				}
				if (a.charAt(i) > 'z')
				{
					t++;
				}
			}
			if (t == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

