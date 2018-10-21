package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[100];
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
		  if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
		  {
		  for (j = i;j < n;j++)
		  {
		   s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
		  }
			n--;
			s = tangible.StringFunctions.changeCharacter(s, n, '\0');
			i = 0;
		  }
		}
		System.out.println(s);
		System.in.read();
		System.in.read();
	}

}

