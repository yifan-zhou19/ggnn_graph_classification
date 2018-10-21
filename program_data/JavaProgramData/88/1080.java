package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j;
	  int n = 0;
	  final String a = "";
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;i < 30;i++)
	  {
			if (a.charAt(i) == '\0')
			{
			break;
			}
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
			System.out.printf("%c",a.charAt(i));
			}
			if ((a.charAt(i) > '9' || a.charAt(i) < '0') && (a.charAt(i - 1) >= '0' && a.charAt(i - 1) <= '9'))
			{
			System.out.print("\n");
			}
	  }
	}

}
