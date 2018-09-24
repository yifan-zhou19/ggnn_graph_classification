package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[1000]);
	 int i;
	 int j;
	 int k;
	 int t;
	 int m;
	 char c;
	 char x;
	 for (i = 0;;i++)
	 {
	  String tempVar = ConsoleInput.scanfRead(null, 1);
	  if (tempVar != null)
	  {
		  str = tangible.StringFunctions.changeCharacter(str, i, tempVar);
	  }
	  if (str.charAt(i) == '\n')
	  {
	   break;
	  }
	 }
	 x = str.charAt(0);
	 m = x;
	 if (m >= 97)
	 {
		 m = m - 32;
		 x = m;
	 }
	 t = 0;
	for (j = 0;j < i;j++)
	{
	 c = str.charAt(j);
	 k = c;
	if (k >= 97)
	{
	  k = k - 32;
	  c = k;
	}
	 if (c == x)
	 {
		 t = t + 1;
	 }
	 if (c != x)
	 {
		 System.out.printf("(%c,%d)",x,t);
		 t = 1;
		 x = c;
	 }
	}
	System.out.printf("(%c,%d)",x,t);
	return 0;
	}
}

