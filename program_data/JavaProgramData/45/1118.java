package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[50]);
		String n = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		int t;
		int i;
		int p;
		int r;
		int j;
		int k;
		int w = 0;
		t = m.length();
		r = n.length();
		for (i = 0;i <= r;i++)
		{
			k = i;
			p = 1;
			for (j = 0;j < t;j++,k++)
			{
				if (m.charAt(j) == n.charAt(k) && w == 0 && p == 1)
				{
					p = 1;
				}
				else
				{
					p = 0;
				}
			}
			if (p == 1)
			{
				System.out.printf("%d",i);
				w = 1;
			}
		}
		return 0;
	}

}

