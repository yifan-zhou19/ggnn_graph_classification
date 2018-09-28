package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		String a = new String(new char[300]);
		char in;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			in = tempVar2.charAt(0);
		}
		for (int i = 1;i <= n;i++)
		{
			for (j = 1;j <= 299;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, tempVar3);
				}
				if (a.charAt(j) == 10)
				{
					k = j;
					break;
				}
			}
			for (j = 1;j <= k - 1;j++)
			{
				if (a.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				if (a.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				if (a.charAt(j) == 'G')
				{
					System.out.print("C");
				}
				if (a.charAt(j) == 'T')
				{
					System.out.print("A");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}






}

