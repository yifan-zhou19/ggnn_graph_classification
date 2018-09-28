package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		final String c = "";
		String p;
		int l1;
		int l2;
		int l;
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
		p = c;
		l1 = a.length();
		l2 = b.length();
		l = l1;
		if (l1 != l2)
		{
		System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l;i++)
			{
				for (j = 0;j < l;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						*(p.Substring(i)) = a.charAt(i);
					}
				}
			}
			if (strcmp(a,c) == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}





}

