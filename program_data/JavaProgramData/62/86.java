package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 final String str = "";
	 str = new Scanner(System.in).nextLine();
	 int len = str.length();
	 int i;
	 for (i = 0;str.charAt(i) != '\0';i++)
	 {
	  int j = i;
	  if (str.charAt(i) == ' ')
	  {
	  i++;
	  while (i < len)
	  {
	   if (str.charAt(i) == str.charAt(i - 1))
	   {
	   i++;
	   }
	   else
	   {
		   i--;
		   break;
	   }
	  }
	  }
	  System.out.printf("%c",str.charAt(j));

	 }
	}
}
