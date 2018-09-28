package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s1 = "";
		final String s2 = "";
		final String s3 = "";
		final String t = "";
		int i;
		int j;
		int k = 0;
		int s;
		int l1;
		int l2;
		int l3;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
		l3 = s3.length();
		for (i = 0;i < l1;)
		{
			for (j = 0;j < l2;j++)
			{
				if (i + j >= l1 != 0 || s1.charAt(i + j) != s2.charAt(j))
				{
					break;
				}
			}
			if (j == l2)
			{
				for (s = 0;s < l3;s++)
				{
					t = tangible.StringFunctions.changeCharacter(t, k, s3.charAt(s));
					k++;
				}
				i = i + l2;
				break;
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, k, s1.charAt(i));
				i++;
				k++;
			}
		}
		for (; i < l1; i++)
		{
			t = tangible.StringFunctions.changeCharacter(t, k, s1.charAt(i));
			k++;
		}
		t = tangible.StringFunctions.changeCharacter(t, k, '\0');
		System.out.printf("%s", t);
		return 0;
	}
}

