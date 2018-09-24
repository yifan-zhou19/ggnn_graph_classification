package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int al;
		int bl;
		int t;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String out = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			int[] anum = new int[100];
		int[] bnum = new int[100];

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			al = a.length();
			bl = b.length();
			for (j = 0;j < al;j++)
			{
				anum[al - 1 - j] = a.charAt(j) - '0';
			}
			for (j = 0;j < bl;j++)
			{
				bnum[bl - 1 - j] = b.charAt(j) - '0';
			}
			for (j = 0;j < bl;j++)
			{
				anum[j] = anum[j] - bnum[j];
			}
			for (j = 0;j < bl;j++)
			{
				if (anum[j] < 0)
				{
					anum[j] = anum[j] + 10;
					anum[j + 1] = anum[j + 1] - 1;
				}
			}
			if (anum[al - 1] == 0)
			{
			{
				for (j = 0;j < al - 1;j++)
				{
			out = tangible.StringFunctions.changeCharacter(out, j, anum[al - 2 - j] + '0');
				}
		};
			out = tangible.StringFunctions.changeCharacter(out, al - 1, '\0');
			}
			if (anum[al - 1] > 0)
			{
				for (j = 0;j < al;j++)
				{
					out = tangible.StringFunctions.changeCharacter(out, j, anum[al - 1 - j] + '0');
				}
				out = tangible.StringFunctions.changeCharacter(out, al, '\0');
			}
			System.out.printf("%s\n",out);
		}
	}
}

