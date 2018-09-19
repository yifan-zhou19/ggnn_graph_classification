package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1001]);
		  char c;
		  a = new Scanner(System.in).nextLine();
		  int i;
		  int k = 1;
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
			   if ((a.charAt(i + 1) == a.charAt(i)) || (a.charAt(i + 1) == a.charAt(i) + 'A'-'a') || a.charAt(i + 1) == (a.charAt(i) - 'A'+'a'))
			   {
				   k++;
			   }
			   else
			   {
				   if (a.charAt(i) < 'a')
				   {
					  System.out.printf("(%c,%d)",a.charAt(i),k);
				   }
				   else
				   {
					  c = a.charAt(i) + 'A'-'a';
					  System.out.printf("(%c,%d)",c,k);
				   }
				   k = 1;
			   }
		  }
	}
}
