package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[max]);
		String b = new String(new char[max]);
		int[] k = new int[max];
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 1;a.charAt(i);i++)
		{
		  if ((a.charAt(i) == ' ') && (a.charAt(i - 1) == ' '))
		  {
			k[i] = 1;
		  }
		}
		for (i = 0,j = 0;a.charAt(i);i++)
		{
		 if (k[i] == 0)
		 {
		 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		 j++;
		 }
		 else
		 {
			 continue;
		 }
		}
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		System.out.println(b);
		return 0;
	}
}

