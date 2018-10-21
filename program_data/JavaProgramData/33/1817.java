package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		String DNA = new String(new char[MAX]);
		String S = new String(new char[MAX]);
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
				DNA = tempVar2.charAt(0);
			}
			for (k = 0;DNA.charAt(k);k++)
			{
				switch (DNA.charAt(k))
				{
					case'A':
					S = tangible.StringFunctions.changeCharacter(S, k, 'T');
					break;
					case'T':
					S = tangible.StringFunctions.changeCharacter(S, k, 'A');
					break;
					case'G':
					S = tangible.StringFunctions.changeCharacter(S, k, 'C');
					break;
					case'C':
					S = tangible.StringFunctions.changeCharacter(S, k, 'G');
					break;
					default:
						S = tangible.StringFunctions.changeCharacter(S, k, DNA.charAt(k));
						break;
				}
			}
			S = tangible.StringFunctions.changeCharacter(S, k, DNA.charAt(k));
			System.out.printf("%s\n", S);
		}
		return 0;
	}
}

