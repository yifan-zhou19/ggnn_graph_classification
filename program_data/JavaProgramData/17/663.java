package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int m = 0;
	public static final String a = "";
	public static void pipei(int m, String a)
	{
	   int i;
	   int j;
	 for (i = m;i <= k - 1;i++)
	 {
		if (a[i].equals(')'))
		{
			break;
		}
		if (!a[i].equals('(') && !a[i].equals(')'))
		{
			a[i] = ' ';
		}
	 }
	  m = i + 1;
	 for (j = i;j >= 0;j--)
	 {
		if (i == k && !a[k - 1].equals(')'))
		{
			break;
		}
		if (a[j].equals('('))
		{
			a[j] = ' ';
			a[i] = ' ';
			break;
		}
	 }
	  if (m <= k - 1)
	  {
		  pipei(m, a);
	  }
	}
	public static int Main()
	{
	  char w;
	  while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	  {
		 k = a.length();
		  int i;
		  int j;
		 System.out.print(a);
		 System.out.print("\n");
		  pipei(0, a);
		 for (i = 0;i <= k - 1;i++)
		 {
			  if (a.charAt(i) == '(')
			  {
			   a = tangible.StringFunctions.changeCharacter(a, i, '$');
			  }
			  if (a.charAt(i) == ')')
			  {
			   a = tangible.StringFunctions.changeCharacter(a, i, '?');
			  }
		 }
		   for (i = 0;i <= k - 1;i++)
		   {
		   System.out.print(a.charAt(i));
		   }
		   System.out.print("\n");
		  for (i = 0;i < 100;i++)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		  }
	  }

	  return 0;
	}

}

