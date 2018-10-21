package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		int i;
		int len;
		int p = 1;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
		{
			System.out.print(a.charAt(0));
		}
		for (i = 1;i < len;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				  if (p == 0)
				  {
					  System.out.print("\n");
				  }
					System.out.print(a.charAt(i));
					p = 1;
			}
			else
			{
				p = 0;
			}
		}
		return 0;
	}




}
