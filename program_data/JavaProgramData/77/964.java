package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char man;
		String a = new String(new char[200]);
		int len;
		int i;
		int j;
		int k;
		int[] w = new int[200];
		int[] m = new int[200];
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
		man = a.charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	hell:
	;
		for (i = 0;i <= len - 1;i++)
		{
			if (a.charAt(i) == man)
			{
				for (j = i + 1;j <= len - 1;j++)
				{
					if (a.charAt(j) == man)
					{
						break;
					}
					if (a.charAt(j) != man && a.charAt(j) != 1)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, 1);
						a = tangible.StringFunctions.changeCharacter(a, j, 1);
						m[++p] = i;
						w[p] = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto hell;
					}
				}
			}
		}
		for (k = 1;k <= p;k++)
		{
			System.out.printf("%d %d\n",m[k],w[k]);
		}

	}
}

