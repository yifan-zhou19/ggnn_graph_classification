package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String sub = new String(new char[100]);
	while (scanf("%s%s",str,sub) != EOF)
	{
	  int m;
	  m = str.length();
	  int i;
	  int j;
	  int temp;
	  int[] as = new int[20];
	  for (i = 0;i <= m - 1;i++)
	  {
		  as[i] = str.charAt(i);
	  }
		for (j = 1;j <= m - 1;j++)
		{
			  if (as[0] < as[j])
			  {
			   as[0] = as[j];
			  }
		}

	  char p;
	  p = as[0];
	  int q;
	 for (i = 0;i <= m - 1;i++)
	 {
		  if (str.charAt(i) == p)
		  {
			  q = i;
			  break;
		  }
	 }
	 for (i = m + 2;i >= q + 1;i--)
	 {
		  str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
	 }
	   str = tangible.StringFunctions.changeCharacter(str, q + 1, sub.charAt(0));
	   str = tangible.StringFunctions.changeCharacter(str, q + 2, sub.charAt(1));
	   str = tangible.StringFunctions.changeCharacter(str, q + 3, sub.charAt(2));
	   str = tangible.StringFunctions.changeCharacter(str, m + 3, '\0');
		  System.out.printf("%s",str);
			 System.out.print("\n");


	}
	}

}

