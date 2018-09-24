package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int j;
		int n;
		int i;
		int k = 0;
		a = tangible.StringFunctions.changeCharacter(a, 0, 2);
		for (i = 1; i < 100; i++)
		{
			a = a.substring(0, i);
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			for (j = 0; j < n - 1;j++)
			{
			int flag = 1;
			for (i = 0; i < 100; i++)
			{
				if (flag != 0)
				{
					if ((a.charAt(i) - 0) * 2 < 10)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, (a.charAt(i) - 0) * 2);
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ((a.charAt(i) - 0) * 2) % 10);
						flag = 0;
					}
				}
				else
				{
					if (((a.charAt(i) - 0) * 2 + 1) < 10)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, (a.charAt(i) - 0) * 2 + 1);
						flag = 1;
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ((a.charAt(i) - 0) * 2) % 10 + 1);
						flag = 0;
					}
				}
			}
			}
		 for (i = 99; i >= 0; i--)
		 {
			 if (a.charAt(i) != 0)
			 {
				 k = 1;
			 }
			 if (k != 0)
			 {
				 System.out.print(a.charAt(i) - '0' + 48);
			 }
		 }
		}
		return 0;
	}

}

