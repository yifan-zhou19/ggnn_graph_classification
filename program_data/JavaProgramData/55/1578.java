package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[100]);
	  String v = new String(new char[100]);
	  int a;
	  int b;
	  int j;
	  int i;
	  int l;
	  int t = 0;
	  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  l = s.length();
	  int m = 1;
	  for (j = 0;j < l;j++)
	  {
		  if (s.charAt(j) >= '0' && s.charAt(j) <= '9')
		  {
			s.charAt(j) -= '0';
		  }
		 if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z')
		 {
			 s.charAt(j) -= ('a' - 10);
		 }
		  if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')
		  {
			  s.charAt(j) -= ('A' - 10);
		  }
	  }
	  for (i = l - 1;i >= 0;i--)
	  {
		t += s.charAt(i) * m;
		m *= a;
	  }
	  m = 0;
	  while (t != 0)
	  {
	   v = tangible.StringFunctions.changeCharacter(v, m, t % b);
	   m++;
	   t = t / b;
	  }
	  for (i = 0;i < m;i++)
	  {
		if (v.charAt(i) >= 0 && v.charAt(i) <= 9)
		{
			v.charAt(i) += '0';
		}
		else if (v.charAt(i) >= 10)
		{
		  v.charAt(i) += ('A' - 10);
		}
	  }
	  for (i = m - 1;i >= 0;i--)
	  {
	  System.out.print(v.charAt(i));
	  }
	  if (m == 0)
	  {
		  System.out.print(0);
	  }
	}

}

