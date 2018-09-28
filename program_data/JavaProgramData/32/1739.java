package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int changa;
		int changb;
		int n;
		int i;
		int j;
		int k = 0;
		int[][] c =
		{
			{'\0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		final String a = "";
		final String b = "";
		final String d = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar3);
			}
			changa = String.valueOf(a.charAt(i)).length();
			changb = String.valueOf(b.charAt(i)).length();
			for (j = changa - changb;j < changa;j++)
			{
				d.charAt(i)[j] = b.charAt(i)[j - changa + changb];
			}

			for (j = 0;j < changa - changb;j++)
			{
				d.charAt(i)[j] = '0';
			}

			for (j = changa - 1;j > 0;j--)
			{
				if (a.charAt(i)[j] < 48)
				{
				 a.charAt(i)[j] = a.charAt(i)[j] + 10;
				 a.charAt(i)[j - 1] = a.charAt(i)[j - 1] - 1;
				}

				if (a.charAt(i)[j] < d.charAt(i)[j])
				{
					a.charAt(i)[j - 1] = a.charAt(i)[j - 1] - 1;
					c[i][j] = (int)10 + a.charAt(i)[j] - d.charAt(i)[j];
				}

				else
				{
					c[i][j] = (int)a.charAt(i)[j] - d.charAt(i)[j];
				}
			}


			c[i][0] = (int)a.charAt(i)[0] - d.charAt(i)[0];

			for (j = 0;j < changa;j++)
			{
				if (c[i][j] != 0)
				{
				break;
				}
			}

			for (k = j;k < changa;k++)
			{
			System.out.printf("%d",c[i][k]);
			}
			System.out.print("\n");

		}

	}
}

