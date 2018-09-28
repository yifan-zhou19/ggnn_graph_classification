package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int xa;
		int xb;
		String sa = new String(new char[100]);
		String sb = new String(new char[100]);
		char[][] str = new char[20][100];
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
				sa = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sb = tempVar3.charAt(0);
			}
			xa = sa.length();
			xb = sb.length();
			xb = xa - xb;
				for (j = xa - 1;j >= xb;j--)
				{
				if (sa.charAt(j) >= sb.charAt(j - xb))
				{
					sa = tangible.StringFunctions.changeCharacter(sa, j, sa.charAt(j) - sb.charAt(j - xb) + 48);
				}
			   else if (sa.charAt(j) < sb.charAt(j - xb))
			   {
					sa = tangible.StringFunctions.changeCharacter(sa, j, sa.charAt(j) - sb.charAt(j - xb) + 48 + 10);
					sa = tangible.StringFunctions.changeCharacter(sa, j - 1, sa.charAt(j - 1) - 1);
			   }
				}
			for (j = 0;j < xa;j++)
			{
				str[i][j] = sa.charAt(j);
			}
			str[i][xa] = '\0';
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str[i]);
		}
	}

}

