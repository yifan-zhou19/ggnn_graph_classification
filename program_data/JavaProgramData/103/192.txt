package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
		int e;
		int[] d = new int[1000];
		for (int i = 0;i < 1000;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == '\n')
			{
				e = i;
				break;
			}
		}
		int k = 0;
		for (int l = 0;l < e;l++)
		{
			d[l] = 1;
		}
		for (int j = 1;j < e;j++)
		{
			if ((a.charAt(j) == a.charAt(j - 1) + 'A'-'a') || (a.charAt(j) == a.charAt(j - 1) - 'A'+'a') || a.charAt(j) == a.charAt(j - 1))
			{
				d[k]++;
			}
			else
			{
				if (a.charAt(j - 1) >= 'a')
				{
					a.charAt(j - 1) += 'A'-'a';
				}
				System.out.printf("(%c,%d)",a.charAt(j - 1),d[k]);
				k++;
			}
		}
		if (a.charAt(e-1) >= 'a')
		{
					a.charAt(e-1) += 'A'-'a';
		}
				System.out.printf("(%c,%d)",a.charAt(e-1),d[k]);
		return 0;
	}
}

