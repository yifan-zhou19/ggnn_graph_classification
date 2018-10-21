package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		String a = new String(new char[260]);
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
		i = 1;
		while (i <= n)
		{
			t = 0;
			do
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, t, tempVar3);
				}
				if (a.charAt(t) == 'A')
				{
					System.out.print("T");
				}
				else if (a.charAt(t) == 'G')
				{
					System.out.print("C");
				}
				else if (a.charAt(t) == 'T')
				{
					System.out.print("A");
				}
				else if (a.charAt(t) == 'C')
				{
					System.out.print("G");
				}
				t = t + 1;
			}while (a.charAt(t - 1) != '\n');
			System.out.print("\n");
			i = i + 1;
		}
		return 0;
	}

}

