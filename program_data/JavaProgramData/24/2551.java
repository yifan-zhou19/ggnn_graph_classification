package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		String m = new String(new char[100]);
		String n = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int max = 0;
		int min = 100;
		for (i = 0;i < t;i++)
		{
			String a = new String(new char[100]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int p;
			p = a.length();
			if (p > max)
			{
				for (j = 0;j < p;j++)
				{
					m = tangible.StringFunctions.changeCharacter(m, j, a.charAt(j));
				}
				max = p;
			}
			if (p < min)
			{
				for (j = 0;j < p;j++)
				{
					n = tangible.StringFunctions.changeCharacter(n, j, a.charAt(j));
				}
				min = p;
			}
		}
		for (i = 0;i < max;i++)
		{
			System.out.printf("%c",m.charAt(i));
		}
			System.out.print("\n");
		for (i = 0;i < min;i++)
		{
			System.out.printf("%c",n.charAt(i));
		}
		return 0;
	}

}

