package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n = 0;
		int m = 1;
		int z = 0;
		int t = 1;
		int g;
		String q = new String(new char[256]);
		String p = new String(new char[256]);
		String w = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			w = tempVar3.charAt(0);
		}
		k = q.length();
		l = p.length();
		for (i = 0;i < k;i++)
		{
			if (p.charAt(0) == q.charAt(i))
			{
			   for (j = 1;j < l;j++)
			   {
				   g = 1;
				 if (p.charAt(j) != q.charAt(j + i))
				 {
					g = 0;
				 }
			   }
					if (g == 1)
					{
						z = 1;
						m = i;
						break;
					}



			}
		}
		if (z != 0)
		{
			for (j = 0;j < m;j++)
			{
				System.out.printf("%c",q.charAt(j));
			}
			System.out.printf("%s",w);
			for (j = m + l;j < k;j++)
			{
				System.out.printf("%c",q.charAt(j));
			}
		}
		else
		{
			System.out.printf("%s",q);
		}
		return 0;
	}
}

