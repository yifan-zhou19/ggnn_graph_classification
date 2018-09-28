package <missing>;

public class GlobalMembers
{
	public static int d = 0;
	public static int c = 0;
	public static int m = 0;
	public static String a = new String(new char[100]);
	public static char b;
	public static char g;
	public static void handshake(int x)
	{
		if (x == c)
		{
		   System.out.print(x - 1);
		   System.out.print(' ');
		   System.out.print(x);
		   System.out.print("\n");
		   a = tangible.StringFunctions.changeCharacter(a, x - 1, ' ');
		   a = tangible.StringFunctions.changeCharacter(a, x, ' ');
		}
		if (x > c && a.charAt(x) == b)
		{
			handshake(x - 1);
		}
		if (x > c && a.charAt(x) == g)
		{

				handshake(x - 1);
				for (m = x - 1;m >= 0;m--)
				{
				   if (a.charAt(m) == b)
				   {
				   System.out.print(m);
				   System.out.print(' ');
				   System.out.print(x);
				   System.out.print("\n");
				   a = tangible.StringFunctions.changeCharacter(a, m, ' ');
				   a = tangible.StringFunctions.changeCharacter(a, x, ' ');
				   break;
				   }
				}
		}
	}
	public static int Main()
	{
		int i = 0;
		int j = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 b = a.charAt(0);
		for (i = 0;i < 100;i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
			 g = a.charAt(i);
			break;
			}

		}
		for (i = 0;i < 100;i++)
		{
		   if (a.charAt(i) == b || a.charAt(i) == g)
		   {
		   d++;
		   }
		}
		for (i = 0;i < d;i++)
		{
		  if (a.charAt(i) == g)
		  {
			 c = i;
			 break;
		  }
		}

		handshake(d - 1);
		   return 0;
	}

}

