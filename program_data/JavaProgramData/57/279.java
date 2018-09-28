package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
		String s = new String(new char[20]);
		int m;
		int n;
		int i;
		int j;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			s = new Scanner(System.in).nextLine();
			len = s.length();
			if (s.charAt(len - 1) == 'g')
			{
				s = tangible.StringFunctions.changeCharacter(s, len - 3, '\0');
			}
			 else
			 {
				 s = tangible.StringFunctions.changeCharacter(s, len - 2, '\0');
			 }
			System.out.println(s);
		}
	 }
}

