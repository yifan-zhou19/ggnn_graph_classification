package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int sum;
		int yes;
		String m = new String(new char[301]);
		char a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		l = m.length();
		for (i = 0;i < l - 1;i++)
		{
						 for (j = 0;j < l - i - 1;j++)
						 {
						 if (m.charAt(j) > m.charAt(j + 1))
						 {
													a = m.charAt(j);
													m = tangible.StringFunctions.changeCharacter(m, j, m.charAt(j + 1));
													m = tangible.StringFunctions.changeCharacter(m, j + 1, a);
						 }
						 }
		}
		sum = 0;
		yes = 0;
		for (i = 0;i < l;i++)
		{
						 if ((m.charAt(i) >= 'A' && m.charAt(i) <= 'Z') || (m.charAt(i) >= 'a' && m.charAt(i) <= 'z'))
						 {
																			sum++;
																			if (m.charAt(i) != m.charAt(i + 1))
																			{
																							 System.out.printf("%c=%d\n",m.charAt(i),sum);
																							 sum = 0;
																							 yes = 1;
																			}
						 }
		}
		if (yes == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

