package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
	   String a = new String(new char[1000]);
	   a = new Scanner(System.in).nextLine();
	   for (i = 1;;i++)
	   {
		  if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
		  {
		for (j = i;;j++)
		{
		   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
		  if (a.charAt(j + 1) == '\0')
		  {
		  break;
		  }
		}
		  i = i - 1;
		  }
		if (a.charAt(i) == '\0')
		{
		break;
		}
	   }
	  System.out.printf("%s",a);
	   System.in.read();
		System.in.read();


	}

}

