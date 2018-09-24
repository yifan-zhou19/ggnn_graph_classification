package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		int A;
		int j;
		A = a.length();
		int[] b = new int[1000]; //?????????0???????????
		for (i = 0;i < 1000;i++)
		{
			b[i] = 1;
		}
		for (i = 0;i < A;i++)
		{
			for (j = i + 1;j < A;j++)
			{
				if (a.charAt(j) == a.charAt(i) || a.charAt(j) == a.charAt(i) - 'a'+'A' || a.charAt(j) == a.charAt(i) - 'A'+'a')
				{
					b[i]++;
				}
				else
				{
					break;
				}


			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
			System.out.printf("(%c,%d)",a.charAt(i),b[i]);
			i = j - 1;
		}
	}
}

