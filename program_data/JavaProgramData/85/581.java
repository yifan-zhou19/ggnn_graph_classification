package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
		char c;
	for (i = 0;i < n;i++)
	{
		a = tangible.StringFunctions.changeCharacter(a, 0, ' ');

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		 for (j = 0;j < a.length();j++)
		 {
			if (a.charAt(0) != '0' && a.charAt(0) != '1' && a.charAt(0) != '2' && a.charAt(0) != '3' && a.charAt(0) != '4' && a.charAt(0) != '5' && a.charAt(0) != '6' && a.charAt(0) != '7' && a.charAt(0) != '8' && a.charAt(0) != '9' && ((a.charAt(j) >= 'a' && a.charAt(j) <= 'z') || (a.charAt(j) == '_') || (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z') || (a.charAt(j) >= '0' && a.charAt(j) <= '9')))
			{
		continue;
			}
			else
			{
				System.out.print("no\n");
			}
			break;
		 }
		 if (j == a.length())
		 {
			 System.out.print("yes\n");
		 }
	}



		return 0;
	}
}

