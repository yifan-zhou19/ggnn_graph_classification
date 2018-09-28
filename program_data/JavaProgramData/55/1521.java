package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static String v = new String(new char[10000]);
	public static int Main()
	{
	  int a;
	  int b;
	  int j;
	  int i;
	  int l;
	  int t = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
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
		else if (v.charAt(i) >= 10 && v.charAt(i) <= 35)
		{
		  v.charAt(i) += ('A' - 10);
		}
	  }
	  for (i = m - 1;i >= 0;i--)
	  {
	  System.out.printf("%c",v.charAt(i));
	  }
	  if (m == 0)
	  {
	   System.out.print("0");
	  }
	  return 0;
	}

}

