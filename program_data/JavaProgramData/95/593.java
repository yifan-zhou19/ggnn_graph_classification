package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int length1;
		int length2;
		int i;
			  String c1 = new String(new char[80]);
			  String c2 = new String(new char[80]);
		c1 = new Scanner(System.in).nextLine();
		c2 = new Scanner(System.in).nextLine();
			  length1 = c1.length();
		length2 = c2.length();
		for (i = 0;i <= length1;i++)
		{
			if (c1.charAt(i) <= 'z' && c1.charAt(i) >= 'a')
			{
				c1.charAt(i) -= 32;
			}
		}
		for (i = 0;i <= length2;i++)
		{
			if (c2.charAt(i) <= 'z' && c2.charAt(i) >= 'a')
			{
				c2.charAt(i) -= 32;
			}
		}
		a = (strcmp(c1,c2));
		if (a > 0)
		{
			System.out.print(">");
		}
		if (a < 0)
		{
			System.out.print("<");
		}
			  if (a == 0)
			  {
				  System.out.print("=");
			  }
		return 0;
	}


}
