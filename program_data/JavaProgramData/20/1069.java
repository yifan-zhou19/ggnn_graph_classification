package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int m;
		int n;
		String s = new String(new char[12]);
		String sb = new String(new char[4]);
		String x = new String(new char[20]);
		while (scanf("%s %s",s,sb) != EOF)
		{
						  m = 0;
							a = s.length();
						 for (i = 1;i < a;i++)
						 {
								  if (s.charAt(i) > s.charAt(m))
								  {
								  m = i;
								  }
						 }
						 for (i = 0;i < m + 1;i++)
						 {
								 x = tangible.StringFunctions.changeCharacter(x, i, s.charAt(i));
						 }
							x [m + 1] = sb.charAt(0);
							x [m + 2] = sb.charAt(1);
							x [m + 3] = sb.charAt(2);
						for (i = m + 4;i < a + 4;i++)
						{
								x = tangible.StringFunctions.changeCharacter(x, i, s.charAt(i - 3));
						}
						for (i = 0;i < a + 3;i++)
						{
							  System.out.printf("%c",x.charAt(i));
						}
						 System.out.print("\n");
		}
	}

}

