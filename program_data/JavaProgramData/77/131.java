package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[100]);
		char boy;
		char girl;
		int i;
		int j;
		int l;
		int k = 0;
		int m;
		int n = 0;
		int[] numb = new int[100];
		int[] numg = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		l = line.length();
		boy = line.charAt(0);
		for (i = 0;i < l;i++)
		{
			if (line.charAt(i) != boy)
			{
				girl = line.charAt(i);
				break;
			}
		}
		for (i = 0;i < l;i++)
		{
			for (j = i;j < l;j++)
			{
				if (line.charAt(i) == boy && line.charAt(j) == girl)
				{
					for (m = i + 1;m < j;m++)
					{
						if (line.charAt(m) != '0')
						{
							n++;
						}
					}
					if (n == 0)
					{
						numb[k] = i;
						numg[k] = j;
						k++;
						line = tangible.StringFunctions.changeCharacter(line, i, '0');
						line = tangible.StringFunctions.changeCharacter(line, j, '0');
						if (line.charAt(0) != '0')
						{
							i = 0;
						}
					}
					n = 0;
				}
			}
		}
		for (i = 0;numg[i] != 0;i++)
		{
			System.out.printf("%d %d\n", numb[i], numg[i]);
		}
		return 0;
	}
}

