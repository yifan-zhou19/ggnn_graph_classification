public class p
{
	   public char c;
	   public int x;
}

package <missing>;

public class GlobalMembers
{
	public static p[] p = tangible.Arrays.initializeWithDefaultpInstances(1000);
	public static int Main()
	{
		  String str = new String(new char[1100]);
		  char i;
		  char L;
		  char j;
		  char s;
		  char t = 0;
		  char count = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  L = str.length();
		  str = tangible.StringFunctions.changeCharacter(str, L, '\0');
		  for (i = 0;i < L;i++)
		  {
						  if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
						  {
						  str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
						  }
		  }
		  s = str.charAt(0);
		  for (i = 0;i <= L;i++)
		  {
				  if (str.charAt(i) == s)
				  {
							   count++;
				  }
				  if (str.charAt(i) != s && str.charAt(i) != '\0')
				  {
							   p[t].c = str.charAt(i - 1);
							   p[t].x = count;
							   count = 1;
							   s = str.charAt(i);
							   t++;
				  }
				  if (str.charAt(i) == '\0' && str.charAt(i - 1) != '\0' && str.charAt(i) != s)
				  {
					 p[t].c = str.charAt(i - 1);
					 p[t].x = count;
					 t++;
					 break;
				  }
		  }
		  for (i = 0;i < t;i++)
		  {
		  System.out.printf("(%c,%d)",p[i].c,p[i].x);
		  }


	}
}

