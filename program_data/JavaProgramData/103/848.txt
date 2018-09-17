package <missing>;

public class GlobalMembers
{
	//??(12-5) ?????? ??? 20121231

	public static String s = new String(new char[1010]);

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int i = 0;
		int d = 1;

		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				s.charAt(i) -= 32;
			}
			if (s.charAt(i + 1) != s.charAt(i) && s.charAt(i + 1) != s.charAt(i) + 32)
			{
				System.out.printf("(%c,%d)",s.charAt(i),d);
				d = 1;
				i++;
				continue;
			}
			d++,i++;
		}
		return 0;
	}

}

