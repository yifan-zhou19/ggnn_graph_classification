package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int j;
		int[] b = new int[52];
		int k;
		int y = 0;
		for (k = 0;k < 300;k++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, tempVar);
			}
			if (a.charAt(k) == '\n')
			{
				a = tangible.StringFunctions.changeCharacter(a, k, '\0');
				break;
			}
			if (a.charAt(k) < 91 && a.charAt(k)>64)
			{
				b[a.charAt(k) - 65]++;
			}
			else if (a.charAt(k) < 123 && a.charAt(k)>96)
			{
				b[a.charAt(k) - 71]++;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (b[j] != 0)
			{
				System.out.printf("%c=%d\n",j + 65,b[j]);
				y++;
			};
		}
		for (;j < 52;j++)
		{
			if (b[j] != 0)
			{
				System.out.printf("%c=%d\n",j + 71,b[j]);
				y++;
			};
		}
			if (y == 0)
			{
				System.out.print("No");
			}

	}

}

