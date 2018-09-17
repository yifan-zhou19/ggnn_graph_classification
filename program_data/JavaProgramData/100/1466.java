package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String store = new String(new char[300]);
		String letr = new String(new char[53]);
		int i;
		int j;
		int f = 0;
		int l;
		store = new Scanner(System.in).nextLine();
		for (j = 0;j < 26;j++)
		{
			letr = tangible.StringFunctions.changeCharacter(letr, j, 'A' + j);
		}
		for (;j < 52;j++)
		{
			letr = tangible.StringFunctions.changeCharacter(letr, j, 'a' + j - 26);
		}
		for (j = 0;j < 52;j++)
		{
			l = 0;
			for (i = 0;store.charAt(i) != 0;i++)
			{
				if (store.charAt(i) == letr.charAt(j))
				{
					l++;
					f = 1;
				}
			}
			if (l != 0)
			{
				System.out.printf("%c=%d\n",letr.charAt(j),l);
			}
		}
		if (f == 0)
		{
			System.out.print("No");
		}
	}

}

