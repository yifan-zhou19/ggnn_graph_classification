package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String c = new String(new char[1000]);
	  int n;
	  int i;
	  int j;
	  c = new Scanner(System.in).nextLine();
	  n = c.length();
	  for (i = n - 1;i >= 0;i = i - 1)
	  {
			if (c.charAt(i) == ' ')
			{
				  for (j = i + 1;(c.charAt(j) != '\0') && (c.charAt(j) != ' ');j = j + 1)
				  {
					   System.out.printf("%c",c.charAt(j));
				  }
				System.out.print(" ");
			}
			if (i == 0)
			{
				  for (j = 0;(c.charAt(j) != ' ') && (c.charAt(j) != '\0');j = j + 1)
				  {
				  System.out.printf("%c",c.charAt(j));
				  }
			}
	  }
	}
}
