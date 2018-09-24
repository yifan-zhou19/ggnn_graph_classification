package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int length_a;
		int length_b;
		int i;
		int j;
		int k;
		String a = new String(new char[128]);
		String b = new String(new char[128]);
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			length_a = a.length();
			length_b = b.length();
			for (j = length_a;(length_a - j) < length_b;j--)
			{
				if (a.charAt(j - 1) >= b.charAt(length_b - 1 + j - length_a))
				{
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) - b.charAt(length_b + j - length_a - 1) + 48);
				}
				else
				{
						a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) + 10 - b.charAt(length_b + j - length_a - 1) + 48);
						k = j - 2;
						while (a.charAt(k) == '0')
						{
							a = tangible.StringFunctions.changeCharacter(a, k, '9');
							k--;
						}
						a.charAt(k)--;
				}
			}
			k = 0;
			while (a.charAt(k) == '0')
			{
				k++;
			}
			for (;k < length_a;k++)
			{
				System.out.print(a.charAt(k));
			}
			System.out.print('\n');
		}
		return 0;
	}

}

