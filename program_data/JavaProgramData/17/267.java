package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String ss = new String(new char[300]);
		int[] a = new int[300];
		int l;
		int i;
		int t;
		do
		{
	if (scanf("%s",s) == EOF)
	{
		break;
	}
			  //gets(s);
			  if (s.charAt(0) == '\0')
			  {
				  break;
			  }
			  l = s.length();
	if (l == 0)
	{
		break;
	}
			  t = 0;
			  for (i = 0;i < l;i++)
			  {
				 ss = tangible.StringFunctions.changeCharacter(ss, i, ' ');
				 if (s.charAt(i) == '(')
				 {
					t++;
					a[t] = i;
				 }
				 if (s.charAt(i) == ')')
				 {
					if (t == 0)
					{
					   ss = tangible.StringFunctions.changeCharacter(ss, i, '?');
					   continue;
					}
					t--;
				 }
			  }
			  for (i = 1;i <= t;i++)
			  {
				  ss = tangible.StringFunctions.changeCharacter(ss, a[i], '$');
			  }
			  ss = tangible.StringFunctions.changeCharacter(ss, l, '\0');
	System.out.println(s);
			  System.out.println(ss);
		} while (0 == 0);
	}

}

