package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tangible.StringFunctions.changeCharacter(a, 0, tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			while (j <= 255)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, tempVar3);
				}
				if (a.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				else if (a.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				else if (a.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				else if (a.charAt(j) == 'G')
				{
					System.out.print("C");
				}
				else
				{
					break;
				}
				j = j + 1;
			}
			System.out.print("\n");
		}
		return 0;
	}
}

