package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String c = new String(new char[50]);
	  int end;
	  int i;
	  int l;
	  c = new Scanner(System.in).nextLine();
	  l = c.length();
	  end = 1;
	  for (i = 0;i < l;i++)
	  {
		if ((c.charAt(i) >= '0') && (c.charAt(i) <= '9'))
		{
		   System.out.printf("%c",c.charAt(i));
		   end = 0;
		}
		if (((c.charAt(i) < '0') || (c.charAt(i)>'9')) && (end == 0))
		{
		   System.out.print("\n");
		   end = 1;
		}
	  }
	  return 0;
	}
}
