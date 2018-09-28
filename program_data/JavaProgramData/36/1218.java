package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int s = 0;
		int l;
		String s1 = new String(new char[255]);
		String s2 = new String(new char[255]);
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
		l = s2.length();
		for (i = 0;i < s1.length();i++)
		{
			for (j = 0;j < l;j++)
			{
				if (s1.charAt(i) == s2.charAt(j))
				{
					s++,s2[j] = 0;
					break;
				}
			}
		}
			if (s < l || s1.length() != l)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.print("YES");
			}

		return 0;

	}

}

