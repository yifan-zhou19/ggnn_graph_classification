package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int count;
		  final String a = "";
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;i < 300;i++)
		  {
							if (a.charAt(i) == '\0')
							{
								break;
							}
							else if (a.charAt(i) != ' ')
							{
									   System.out.printf("%c",a.charAt(i));
									   count = 0;
							}
							else if (count == 0 && count == 0)
							{
								 System.out.print(" ");
								 count++;
							}
		  }
	}
}
