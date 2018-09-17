package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char x;
		String a = new String(new char[1000]);
		int i;
		int j;
		int k;
		int t;
		int[] c = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		k = s.length();
		for (i = 0;i < k;i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				s.charAt(i) -= 32;
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, 0, s.charAt(0));
		x = s.charAt(0);
		for (i = 1,t = 1;i < k;i++)
		{
			if (x != s.charAt(i))
			{
				c[t] = i;
				x = s.charAt(i);
				a = tangible.StringFunctions.changeCharacter(a, t, s.charAt(i));
				t++;
			}
		}
		c[t] = k;
		for (i = 0;i <= t - 1;i++)
		{
			System.out.printf("(%c,%d)",a.charAt(i),c[i + 1] - c[i]);
		}
		return 0;
	}
}

