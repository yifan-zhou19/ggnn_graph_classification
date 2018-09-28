package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int c = 0;
		String s1 = new String(new char[500]);
		String s2 = new String(new char[500]);
		s1 = new Scanner(System.in).nextLine();
		n = s1.length();
		int[] a = new int[500];
		for (i = n - 1;i >= 0;i--)
		{
			 if (s1.charAt(i) == ' ')
			 {
					if (s1.charAt(i - 1) == ' ')
					{
							a[i - 1] = a[i] + 1;
							c++;
					}
			 }
		}
		for (i = 0,j = 0;i < n;i++,j++)
		{
			 if (a[i] != 0)
			 {
					i = i + a[i];
			 }
			 s2 = tangible.StringFunctions.changeCharacter(s2, j, s1.charAt(i));
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, n - c, '\0');
		System.out.printf("%s",s2);
		return 0;
	}


}

