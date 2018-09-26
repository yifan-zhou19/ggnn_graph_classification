package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char z;
		int n;
		int q;
		int w;
		int e;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (int i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
			   if (a.charAt(i - 1) == ' ')
			   {
				for (w = i;a.charAt(w) != '\0';w++)
				{
					a = tangible.StringFunctions.changeCharacter(a, w, a.charAt(w + 1));
				}
				i--;
			   }
			}
		}
		System.out.println(a);
		return 0;
	}



}

