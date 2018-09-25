package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int i;
	  int j;
	  int k;
	  String c = new String(new char[50]);
	  c = new Scanner(System.in).nextLine();
	  k = c.length();
	  for (i = 0;i < k;i++)
	  {
	   if (c.charAt(i) >= 48 && c.charAt(i) <= 57)
	   {
		if (c.charAt(i + 1) >= 48 && c.charAt(i + 1) <= 57)
		{
			System.out.printf("%c",c.charAt(i));
		}
		else
		{
		System.out.printf("%c\n",c.charAt(i));
		}
	   }
	  }

	}

}
