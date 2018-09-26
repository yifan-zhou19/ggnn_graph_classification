package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[50000]);

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int n = a.length();
		int flag = 0;
		int isfirst = 1;
		 a = tangible.StringFunctions.changeCharacter(a, n, ' ');
		for (j = 0;j < n;j++)
		{
			if (a.charAt(j) != ' ')
			{
			 flag++;
			}

		 if (a.charAt(j + 1) == ' ' && a.charAt(j) != ' ' && isfirst != 1)
		 {
			 System.out.printf(",%d",flag);
		  flag = 0;
		 }
		 if (a.charAt(j + 1) == ' ' && a.charAt(j) != ' ' && isfirst == 1)
		 {
			 System.out.printf("%d",flag);
		  isfirst = 0;
		  flag = 0;
		 }




		}
	return 0;
	}
}

