package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[999]);
		String b = new String(new char[999]);
		int m;
		int n;
		int c;
		int i;
		int r;
		int e;
		a = new Scanner(System.in).nextLine();
		m = a.length();
		b = new Scanner(System.in).nextLine();
		n = b.length();
		r = c = (m > n)?m:n;
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{

				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) > 64 && b.charAt(i) < 91)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}

		   if ((a.charAt(i) == b.charAt(i)) || (a.charAt(i) == b.charAt(i) + 32) || (a.charAt(i) == b.charAt(i) - 32))
		   {
		   r--;
		   }
		  else if (a.charAt(i) > b.charAt(i))
		  {
			  e = 0;
			   System.out.print(">");
			   break;

		  }
			   else if (a.charAt(i) < b.charAt(i))
			   {
			  e = 0;
			   System.out.print("<");
			   break;
			   }

		}
		   if (r == 0)
		   {
			   System.out.print("=");
		   }

		return 0;
	}
}

