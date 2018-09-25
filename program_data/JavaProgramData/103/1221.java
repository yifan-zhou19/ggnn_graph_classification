package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1001]);
		int i;
		int t;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		k = s.length();
		for (i = 0;i < k;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
			}
		}
		t = 1;
		for (i = 0;i < k;i++)
		{
			\
			{

			if (s.charAt(i) == s.charAt(i + 1))
			{
			t++;
			}
			else
			{
			System.out.printf("(%c,%d)",s.charAt(i),t);
			t = 1;
			continue;
			}
			}
		}
	}
}

