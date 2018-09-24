package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String a = new String(new char[255]);

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int len = a.length();

			for (int j = 0;j < len;j++)
			{
				if (a.charAt(j) == 'A')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 19);
				}
				else if (a.charAt(j) == 'T')
				{

					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 19);
				}
				else if (a.charAt(j) == 'C')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) + 4);
				}
				else if (a.charAt(j) == 'G')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 4);
				}

			}
			System.out.println(a);


		}

	}
}

