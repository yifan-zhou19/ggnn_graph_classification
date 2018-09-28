package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String max;
		String min;
		s = new Scanner(System.in).nextLine();

		int i;
		int mina = 0;
		int minb = 50;
		int maxa = 0;
		int maxb = 0;
		int ta = 0;
		int tb;
		int n = s.length();
		for (i = 1; i < n + 1; i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				tb = i;
				if (tb - ta > maxb - maxa)
				{
					maxb = tb;
					maxa = ta;
				}
				if (tb - ta < minb - mina)
				{
					minb = tb;
					mina = ta;
				}
				ta = tb + 1;
			}
		}
		max = s.charAt(maxa);
		min = s.charAt(mina);
		System.out.printf("%s\n%s", max, min);

		return 0;
	}
}

