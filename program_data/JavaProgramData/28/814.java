package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[2560]);
		String[] words = new String[1000];
		zfc = new Scanner(System.in).nextLine();
		int n;
		int k;
		int i;
		int j;
		n = 0;
		k = 0;
		for (i = 0; zfc.charAt(i) != 0; i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				zfc = tangible.StringFunctions.changeCharacter(zfc, i, '\0');
				words[n] = zfc.Substring(k);
				n++;
				k = i + 1;
			}
		}
		words[n] = zfc.Substring(k);
		int[] cd = new int[1000];
		for (i = 0,j = 0;i < n + 1;i++,j++)
		{
			cd[i] = String.valueOf(words[j]).length();
		}
		for (i = 0;i < n + 1;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",cd[i]);
			}
			if (i != 0 && cd[i] != 0)
			{
				System.out.printf(",%d",cd[i]);
			}
		}
		return 0;
	}



}

