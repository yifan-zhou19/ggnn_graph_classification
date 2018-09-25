package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//


	public static int Main()
	{
		int y = 0;
		int k;
		int x;
		int temp;
		int p;
		int q;
		int t;
		int i;
		int j = 0;
		int[] boy = new int[100];
		int[] girl = new int[100];
		String a = new String(new char[100]);
		String sex = new String(new char[2]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sex = tangible.StringFunctions.changeCharacter(sex, 0, a.charAt(0));
		for (i = 1;;i++)
		{
			if (a.charAt(i) != a.charAt(0))
			{
				sex = tangible.StringFunctions.changeCharacter(sex, 1, a.charAt(i));
				break;
			}
		}
		for (i = 0;;i++)
		{
			for (k = 0;a.charAt(k) != '\0';k++)
			{
				if (a.charAt(k) != '*')
				{
					y = 1;
				}
			}
			if (y == 0)
			{
				break;
			}
			y = 0;
			if (a.charAt(i) == '*')
			{
				continue;
			}
			if (a.charAt(i + 1) == '\0')
			{
				i = -1;
				continue;
			}
			if (a.charAt(i) == sex.charAt(0))
			{
				for (k = i + 1;a.charAt(k) != sex.charAt(0);k++)
				{
					if (a.charAt(k) == sex.charAt(1))
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '*');
						a = tangible.StringFunctions.changeCharacter(a, k, '*');
						boy[j] = i;
						girl[j] = k;
						j++;
						break;
					}
				}
			}
		}
		for (p = 0;p < j - 1;p++)
		{
			for (q = 0;q < j - 1 - p;q++)
			{
				if (girl[q] > girl[q + 1])
				{
					temp = girl[q + 1];
					girl[q + 1] = girl[q];
					girl[q] = temp;
					temp = boy[q + 1];
					boy[q + 1] = boy[q];
					boy[q] = temp;
				}
			}
		}
		for (x = 0;x <= j - 1;x++)
		{
			System.out.print(boy[x]);
			System.out.print(" ");
			System.out.print(girl[x]);
			System.out.print("\n");
		}
		return 0;
	}

}

