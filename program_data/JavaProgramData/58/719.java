package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100]);
	public static int l;
	public static int check()
	{
	 int i;
	 if ((s.charAt(0) < 'A' || s.charAt(0)>'Z') && (s.charAt(0) < 'a' || s.charAt(0)>'z') && (s.charAt(0) != '_'))
	 {
		 return 0;
	 }
	 for (i = 0;i < l;i++)
	 {
	  if ((s.charAt(i) < 'A' || s.charAt(i)>'Z') && (s.charAt(i) < 'a' || s.charAt(i)>'z') && (s.charAt(i) != '_') && (s.charAt(i) < '0' || s.charAt(i)>'9'))
	  {
		  return 0;
	  }
	 }
	 return 1;
	}
	public static int Main()
	{
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	 for (j = 0;j <= 99;j++)
	 {
		s = s.substring(0, j);
	 }
	 l = 0;
	 String tempVar2 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar2 != null)
	 {
		 s = tangible.StringFunctions.changeCharacter(s, 0, tempVar2);
	 }
	 while (s.charAt(l) != '\n')
	 {
		l++;
		String tempVar3 = ConsoleInput.scanfRead(null, 1);
		if (tempVar3 != null)
		{
			s = tangible.StringFunctions.changeCharacter(s, l, tempVar3);
		}
	 }

	 System.out.printf("%d\n",check());
	}
	return 0;
	}
}

