package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x = 0;
	String a = new String(new char[35]);
	a = new Scanner(System.in).nextLine();
	for (int i = 0;a.charAt(i) != '\0';i++)
	{
	   if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
	   {
		 System.out.printf("%d",a.charAt(i) - '0');
		 for (int j = 1;;j++)
		 {
			if (a.charAt(i + j) >= '0' && a.charAt(i + j) <= '9')
			{
			  System.out.printf("%d",a.charAt(i + j) - '0');
			}
			else
			{
				i = i + j - 1;
				System.out.print("\n");
				break;
			}
		 }
	   }
	}
	}

}
