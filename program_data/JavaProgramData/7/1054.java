package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s0 = new String(new char[257]);
		String s1 = new String(new char[257]);
		String s2 = new String(new char[257]);
		int i;
		int j;
		int k0;
		int k1;
		int k2;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s0 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		for (i = 0;s0.charAt(i) != '\0';i++)
		{
			j = 0;
			if (s1.charAt(0) == s0.charAt(i))
			{
			for (j = 1;s1.charAt(j) != '\0';j++)
			{
			if (s1.charAt(j) != s0.charAt(i + j))
			{
				break;
			}
			}
			}
			if (s1.charAt(j) == '\0')
			{
				k0 = k1 = k2 = 0;
				while (s0.charAt(k0) != '\0')
				{
					k0++;
				}
				while (s1.charAt(k1) != '\0')
				{
					k1++;
				}
				while (s2.charAt(k2) != '\0')
				{
					k2++;
				}
				for (l = i + k1;l < k0;l++)
				{
				s0 = tangible.StringFunctions.changeCharacter(s0, l + k2 - k1, s0.charAt(l));
				}
				for (l = 0;l < k2;l++)
				{
				s0 = tangible.StringFunctions.changeCharacter(s0, i + l, s2.charAt(l));
				}
				break;
			}
		}
		l = 0;
		while (s0.charAt(l) != '\0')
		{
			System.out.printf("%c",s0.charAt(l));
			l++;
		}

	}

}

