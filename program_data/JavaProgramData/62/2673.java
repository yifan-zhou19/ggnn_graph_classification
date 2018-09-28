package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  int i = 0;
		  int j = 0;
		  String c = new String(new char[1000]);
			  c = new Scanner(System.in).nextLine();
		  for (i = 0;c.charAt(i) != '\0';i++)
		  {
			  if (c.charAt(i) != ' ')
			  {
				System.out.printf("%c",c.charAt(i));
			  }
			  else if (i >= 1 && c.charAt(i) == ' ')
			  {
					  if (c.charAt(i - 1) != ' ')
					  {
						 System.out.print(" ");
					  }
			  }

		  }

		// scanf("%d",&i);
		  return 0;
	  }

}
