package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[600];
		String zfc = new String(new char[600]);
		char[][] words = new char[300][100];
		zfc = new Scanner(System.in).nextLine();
		int i;
		int n = 0;
		int k = 0;
		for (i = 0;zfc.charAt(i) != 0;i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				zfc = tangible.StringFunctions.changeCharacter(zfc, i, '\0');
				words[n] = (zfc.Substring(k));
				n++;
				k = i + 1;
			}
		}
		words[n] = (zfc.Substring(k));
		n++;
		for (i = 0;i < n;i++)
		{
			sz[i] = String.valueOf(words[i]).length();
		}
		System.out.printf("%d",sz[0]);
		for (i = 1;i < n;i++)
		{
			if (sz[i] != 0)
			{
				System.out.printf(",%d",sz[i]);
			}
		}
		return 0;
	}
}

