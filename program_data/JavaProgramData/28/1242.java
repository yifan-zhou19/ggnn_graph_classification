package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int sum = 0;
	  String a = new String(new char[10000]);
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	  for (i = 0;i < n;i++)
	  {
		if (a.charAt(i) != ' ')
		{
		  sum = sum + 1;
		  continue;
		}
		else if (a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
		{
		  System.out.printf("%d,",sum);
		  sum = 0;
		}
		else
		{
			continue;
		}
	  }
	  System.out.printf("%d",sum);
	}
}
