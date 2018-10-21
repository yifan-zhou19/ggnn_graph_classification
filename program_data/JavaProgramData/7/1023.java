package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[256]);
		  String sub = new String(new char[256]);
		  String re = new String(new char[256]);
		  String sl = new String(new char[256]);
		  int n;
		  int m;
		  int i;
		  int j;
		  int k;
		  int e;
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sub = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  re = tempVar3.charAt(0);
		  }
		  l = 0;
		  while (s.charAt(l) != '\0')
		  {
			  l++;
		  }
		  m = 0;
		  while (sub.charAt(m) != '\0')
		  {
			  m++;
		  }
		  n = 0;
		  while (re.charAt(n) != '\0')
		  {
			  n++;
		  }
		  for (i = 0;i < l;i++)
		  {
				 k = 1;
				 for (j = 0;j < m;j++)
				 {
					  if (s.charAt(i + j) != sub.charAt(j))
					  {
						  k = 0;
						  break;
					  }
				 }
				 if (k == 1)
				 {
						e = i;
						break;
				 }
		  }
		  if (k == 1)
		  {
			 for (i = e + m - 1;s.charAt(i) != '\0';i++)
			 {
				 sl = tangible.StringFunctions.changeCharacter(sl, i, s.charAt(i));
			 }
			 sl = tangible.StringFunctions.changeCharacter(sl, i + 1, '\0');
			 for (i = 0;i < n;i++)
			 {
				 s = tangible.StringFunctions.changeCharacter(s, e + i, re.charAt(i));
			 }
			 for (i = e + n;sl.charAt(i - n + m) != '\0';i++)
			 {
				 s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i - n + m));
			 }
			 s = tangible.StringFunctions.changeCharacter(s, i + 1, '\0');
		  }
		  for (i = 0;s.charAt(i) != '\0';i++)
		  {
			  System.out.printf("%c",s.charAt(i));
		  }
		  System.out.print("\n");
		  System.in.read();
		  System.in.read();
	}
}

