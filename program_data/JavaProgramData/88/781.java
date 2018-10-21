package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  String a = new String(new char[30]);
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i < 30;i++)
	  {
		if (a.charAt(i) >= 48 && a.charAt(i) <= 57)
		{
		  System.out.printf("%c",a.charAt(i));
		}
		else
		{
		  if (a.charAt(i - 1) >= 48 && a.charAt(i - 1) <= 57)
		  {
		  System.out.print("\n");
		  }
		}
	  }
	}
}
