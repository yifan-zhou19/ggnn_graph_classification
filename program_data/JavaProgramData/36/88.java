package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		char d;
		String p;
		String q;
		int al;
		int bl;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		al = a.length();
		bl = b.length();
		p = a;
		q = b;
			for (j = 0;j < al;j++)
			{
				for (i = 0;i < al + 1 - j;i++)
				{
					if (*(p.Substring(i)) < *(p.Substring(i) + 1))
					{
						c = (p.Substring(i));
						*(p.Substring(i)) = *(p.Substring(i) + 1);
						*(p.Substring(i) + 1) = c;
					}
				}
			}
			for (j = 0;j < bl;j++)
			{
				for (i = 0;i < bl + 1 - j;i++)
				{
					if (*(q.Substring(i)) < *(q.Substring(i) + 1))
					{
						d = (q.Substring(i));
						*(q.Substring(i)) = *(q.Substring(i) + 1);
						*(q.Substring(i) + 1) = d;
					}
				}
			}
			if (strcmp(a,b) == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}

		return 0;
	}


}

