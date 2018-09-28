package <missing>;

public class GlobalMembers
{
	public static void char_revto_int(tangible.RefObject<String> s, int[] a, int len)
	{
		for (int i = len - 1 ; i >= 0 ; i--)
		{
			a[len - 1 - i] = s.argValue.charAt(i) - '0';
		}
	}

	public static void add_int(int[] a1, int[] a2, int[] res)
	{
		for (int i = 0 ; i < MAX_LEN ; i++)
		{
			res[i] += a1[i] + a2[i];
			if (res[i] >= 10)
			{
				res[i] -= 10;
				res[i + 1]++;
			}
		}
	}

	public static void output_int(int[] a)
	{
		int len = MAX_LEN;
		while (!a[len - 1])
		{
			len--;
		}
		if (len <= 0)
		{
			System.out.print("0");
		}
		for (int i = len - 1 ; i >= 0 ; i--)
		{
			System.out.printf("%d", a[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		int[] an1 = new int[210];
		int[] an2 = new int[210];
		int[] res = new int[210];
		String s1 = new String(new char[210]);
		String s2 = new String(new char[210]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
		char_revto_int(tempRef_s1, an1, s1.length());
		s1 = tempRef_s1.argValue;
	tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s2);
		char_revto_int(tempRef_s2, an2, s2.length());
		s2 = tempRef_s2.argValue;
		add_int(an1, an2, res);
		output_int(res);
		return 0;
	}
}

