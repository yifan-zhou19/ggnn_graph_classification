package <missing>;

public class GlobalMembers
{
	public static int pd(tangible.RefObject<String> p, int l1, String s1)
	{
		int i;
		int t;
		t = 1;
		for (i = 0;i < l1;i++)
		{
			if (!s1[i].equals() != *(p.argValue.Substring(i)))
			{
				t = 0;
				break;
			}
		}
		return (t);
	}

	public static int Main()
	{
		int l;
		int i;
		int j;
		int t;
		int l1;
		int l2;
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}

		p = s2;
		l2 = s2.length();
		l1 = s1.length();
		for (i = 0;i < l2;i++)
		{
			if (pd(p.Substring(i), l1, s1) != 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}



}

