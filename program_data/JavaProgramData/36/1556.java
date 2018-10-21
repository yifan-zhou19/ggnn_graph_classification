package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String s1 = new String(new char[200]);
		String s2 = new String(new char[200]);
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
		if (s1.length() != s2.length())
		{
			System.out.print("NO");
			return 0;
		}
		for (i = 0;s1.charAt(i);i++)
		{
			n = 0;
			for (k = 0;s2.charAt(k);k++)
			{
				if (s2.charAt(k) == s1.charAt(i))
				{
					s2 = tangible.StringFunctions.changeCharacter(s2, k, ' ');
					n = 1;
					break;
				}
			}
			if (n == 0)
			{
				System.out.print("NO");
				return 0;
			}
		}
		System.out.print("YES");
		//scanf("%d",&n);
		return 0;
	}
}

