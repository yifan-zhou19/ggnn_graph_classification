package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

			int n;
			int i;
			int j;
			int m;
			char A;
			char T;
			char C;
			char G;
			String a = new String(new char[10000]);
			String b = new String(new char[10000]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 0;1;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, System.in.read());
					if (a.charAt(j) == '\n')
					{
						break;
					}
				if (a.charAt(j) == 'A')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'T');
				}
				else if (a.charAt(j) == 'T')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'A');
				}
				else if (a.charAt(j) == 'C')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'G');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, j, 'C');
				}
				}
				for (m = 0;m <= j - 1;m++)
				{
					System.out.print(b.charAt(m));
				}
				System.out.print('\n');
			}
			return 0;
	}

}

