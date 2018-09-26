package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  String c = new String(new char[n]);
	  c = new Scanner(System.in).nextLine();
	  for (i = 0;i < n;i++)
	  {
		if ((c.charAt(i) == '0' || c.charAt(i) == '1' || c.charAt(i) == '2' || c.charAt(i) == '3' || c.charAt(i) == '4' || c.charAt(i) == '5' || c.charAt(i) == '6' || c.charAt(i) == '7' || c.charAt(i) == '8' || c.charAt(i) == '9') && (c.charAt(i + 1) != '0' && c.charAt(i + 1) != '1' && c.charAt(i + 1) != '2' && c.charAt(i + 1) != '3' && c.charAt(i + 1) != '4' && c.charAt(i + 1) != '5' && c.charAt(i + 1) != '6' && c.charAt(i + 1) != '7' && c.charAt(i + 1) != '8' && c.charAt(i + 1) != '9'))
		{
			System.out.printf("%c\n",c.charAt(i));
		}
		else if ((c.charAt(i) == '0' || c.charAt(i) == '1' || c.charAt(i) == '2' || c.charAt(i) == '3' || c.charAt(i) == '4' || c.charAt(i) == '5' || c.charAt(i) == '6' || c.charAt(i) == '7' || c.charAt(i) == '8' || c.charAt(i) == '9') && (c.charAt(i + 1) == '0' || c.charAt(i + 1) == '1' || c.charAt(i + 1) == '2' || c.charAt(i + 1) == '3' || c.charAt(i + 1) == '4' || c.charAt(i + 1) == '5' || c.charAt(i + 1) == '6' || c.charAt(i + 1) == '7' || c.charAt(i + 1) == '8' || c.charAt(i + 1) == '9'))
		{
			System.out.printf("%c",c.charAt(i));
		}
	  }
	  return 0;
	}
}
