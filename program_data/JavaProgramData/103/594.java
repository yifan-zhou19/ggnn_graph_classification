package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int n;
		int num = 1;
		String str = new String(new char[1001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();


		for (i = 0 ;i <= (n - 1) ;i++)
		{
				if (str.charAt(i) >= 97)
				{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
				}
		}


		for (i = 0 ;i <= (n - 1) ;i++)
		{
				if (str.charAt(i) == str.charAt(i + 1))
				{
				num++;
				}
				else
				{
				System.out.printf("(%c,%d)",str.charAt(i),num);
				num = 1;
				}

		}





	}

}

