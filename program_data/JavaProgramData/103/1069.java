package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int n;
		int m;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (h = 0;h < n;h++)
		{
						if (a.charAt(h) > 'Z')
						{
						a = tangible.StringFunctions.changeCharacter(a, h, a.charAt(h) - 'a'+'A');
						}
		}
		for (i = 0;i < n;)
		{
						m = 1;
						for (g = i + 1;g < n;g++)
						{
										  if (a.charAt(i) == a.charAt(g))
										  {
											  m += 1;
										  }
										  else
										  {
											  System.out.printf("(%c,%d)",a.charAt(i),m);
											  i = g;
											  break;
										  }
						}
						i = g;
		}
		System.out.printf("(%c,%d)",a.charAt(i - 1),m);
		return 0;
	}
}

