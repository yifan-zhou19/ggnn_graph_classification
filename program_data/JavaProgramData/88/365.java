package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++)
		{
						  if (a.charAt(i) == '0' || a.charAt(i) == '1' || a.charAt(i) == '2' || a.charAt(i) == '3' || a.charAt(i) == '4' || a.charAt(i) == '5' || a.charAt(i) == '6' || a.charAt(i) == '7' || a.charAt(i) == '8' || a.charAt(i) == '9')
						  {
																													   System.out.printf("%c",a.charAt(i));
						  }
						  else
						  {
							  System.out.print("\n");
						  }
		}
		return 0;
	}
}
