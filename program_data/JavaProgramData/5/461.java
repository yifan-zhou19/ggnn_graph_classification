package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		final String st = "ATGC";
		int len1;
		int len2;
		int i;
		int s = 0;
		double x;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		int F = 0;
		if (len1 != len2)
		{
			System.out.print("error");
			F = 1;
		}
		if (F == 0)
		{
		for (i = 0;i < len1;i++)
		{
			if ((a.charAt(i) != st.charAt(0)) && (a.charAt(i) != st.charAt(1)) && (a.charAt(i) != st.charAt(2)) && (a.charAt(i) != st.charAt(3)))
			{
				System.out.print("error");
				F = 1;
				break;
			}
		}
		}
		if (F == 0)
		{
		for (i = 0;i < len2;i++)
		{
			if ((b.charAt(i) != st.charAt(0)) && (b.charAt(i) != st.charAt(1)) && (b.charAt(i) != st.charAt(2)) && (b.charAt(i) != st.charAt(3)))
			{
				System.out.print("error");
				F = 1;
				break;
			}
		}
		}
		if (F == 0)
		{
			for (i = 0;i < len1;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					s++;
				}
			}
			n = (double)s / len1;
			if (n > x)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

