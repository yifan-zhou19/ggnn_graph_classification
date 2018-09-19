package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String str = new String(new char[11]);
	  String substr = new String(new char[4]);
	  int m;
	  int i;
	  int e;
	  while (scanf("%s%s",str,substr) != EOF)
	  {
		m = str.length();
		e = 0;
		for (i = 1;i < m;i++)
		{
		   if (str.charAt(i) > str.charAt(e))
		   {
			   e = i;
		   }
		}
	  for (i = 0;i <= e;i++)
	  {
		  System.out.printf("%c",str.charAt(i));
	  }
	  for (i = 0;i < 3;i++)
	  {
		  System.out.printf("%c",substr.charAt(i));
	  }
	  for (i = e+1;i < m - 1;i++)
	  {
	  System.out.printf("%c",str.charAt(i));
	  }
	  System.out.printf("%c\n",str.charAt(m - 1));
	  }

	}

}
