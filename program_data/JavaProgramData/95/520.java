package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		String s = new String(new char[80]);
		String w = new String(new char[80]);
		s = new Scanner(System.in).nextLine();
		w = new Scanner(System.in).nextLine();
		a = s.length();
		for (i = 0;i < a;i++)
		{
			if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
			{
				s.charAt(i) += 32;
			}
			if ((w.charAt(i) >= 'A') && (w.charAt(i) <= 'Z'))
			{
				w.charAt(i) += 32;
			}
		}
		for (i = 0;i < a;i++)
		{
			if ((s.charAt(i) > w.charAt(i)))
			{
				System.out.print(">");
				break;
			}
			if ((s.charAt(i) < w.charAt(i)))
			{
				System.out.print("<");
				break;
			}
		}
		if (i == a)
		{
			System.out.print("=");
		}
		return 0;
	}


}
