package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		String a = new String(new char[10000]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[] b = new int[10000];
		String c = new String(new char[10000]);
		char d;
		l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;(d = s.charAt(i)) != '\0';i++)
		{
			l = l + 1;

		}

		n = 1;
		k = 0;
		j = 0;
	for (i = 0;(d = s.charAt(i)) != '\0';i++)
	{

			if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 1) - 32 || s.charAt(i) == s.charAt(i + 1) + 32)
			{
				n = n + 1;
				if (s.charAt(i) >= 97)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i) - 32);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
				}
				b[j] = n;
			}
			else
			{
				if (s.charAt(i + 1) != '\0')

				{
				k = k + 1;
				if (s.charAt(i) >= 97)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i) - 32);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
				}
				b[j] = n;
				j = j + 1;
				n = 1;
				}
			else
			{
				k = k + 1;
				if (s.charAt(i) >= 97)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i) - 32);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
				}
				b[j] = n;
				j = j + 1;
			}
			}
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("(%c,%d)",a.charAt(i),b[i]);
	}

	}
}

