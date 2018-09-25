package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i = 0;
		int j;
		int k;
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		while (a.charAt(i) != '\0')
		{
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		{
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
		}
		i++;
		}

		for (j = 0;j < i;)
		{
			b[j] = 0;
			for (k = j;k < i;k++)
			{
			if (a.charAt(j) == a.charAt(k))
			{
			b[j]++;
			}
			else
			{
			break;
			}

			}
			System.out.printf("(%c,%d)",a.charAt(j),b[j]);
			j = k;
		}

	}

}

