package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		String a = new String(new char[100000]);
		String m = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = tempVar2.charAt(0);
				}
				for (int j = 0;j < a.length();j++)
				{
						c = 1;
						for (int k = 0;k < a.length();k++)
						{
								if (a.charAt(k) == a.charAt(j) && k != j)
								{
								  c = 0;
								  break;
								}
						}
						if (c == 1)
						{
						  m = tangible.StringFunctions.changeCharacter(m, i, a.charAt(j));
						  break;
						}
				}
				if (c == 0)
				{
				  m = tangible.StringFunctions.changeCharacter(m, i, '0');
				}
		}
		for (int i = 0;i < n;i++)
		{
				if (m.charAt(i) == '0')
				{
				  System.out.print("no\n");
				}
				else
				{
				  System.out.printf("%c\n",m.charAt(i));
				}
		}
		return 0;
	}
}

