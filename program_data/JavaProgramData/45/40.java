package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String p = new String(new char[50]);
		String q = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		int m;
		int n;
		m = p.length();
		n = q.length();
		int i;
		int t;
		for (i = 0;i < n;i++)
		{
			int b = 0;
			t = i;
			for (int j = 0;j < m;j++)
			{
				if (p.charAt(j) == q.charAt(t))
				{
					b++;
				}
				else
				{
					b = b;
				}
				t++;
			}
			if (b == m)
			{
				System.out.printf("%d",t - m);
				for (int h = 0;h < m;h++)
				{
					p = tangible.StringFunctions.changeCharacter(p, h, '1');
				}
			}
		}
	}

}

