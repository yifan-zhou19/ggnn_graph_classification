package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String a = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j < 300;j++)
			{
				 String tempVar2 = ConsoleInput.scanfRead(null, 1);
				 if (tempVar2 != null)
				 {
					 a = tangible.StringFunctions.changeCharacter(a, j, tempVar2);
				 }
				 if (a.charAt(j) == 10)
				 {
					 k = j - 1;
					 break;
				 }
			}
			for (j = 1;j <= k;j++)
			{
				switch (a.charAt(j))
				{
					case'A':
					a = tangible.StringFunctions.changeCharacter(a, j, 'T');
					break;
					case'T':
					a = tangible.StringFunctions.changeCharacter(a, j, 'A');
					break;
					case'C':
					a = tangible.StringFunctions.changeCharacter(a, j, 'G');
					break;
					case'G':
					a = tangible.StringFunctions.changeCharacter(a, j, 'C');
					break;
				}


			}
			for (j = 1;j <= k;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

