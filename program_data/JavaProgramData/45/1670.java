package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[60]);
		String w = new String(new char[60]);
		String temp = new String(new char[60]);
		int i;
		int n;
		int m;
		int j;
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		n = w.length();
		m = s.length();

		for (i = 0;i < n;i++)
		{
			temp = tangible.StringFunctions.changeCharacter(temp, 0, '\0');
			t = 1;
			for (j = 0;j < m;j++)
			{
			  if (s.charAt(j) != w.charAt(i + j))
			  {
				  t = 0;
				  break;
			  }
			}
			if (t != 0)
			{
				break;
			}

		}

		System.out.printf("%d",i);

		return 0;
	}
}

