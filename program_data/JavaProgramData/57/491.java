package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		String c = new String(new char[1]);
		String ch = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			ch = new Scanner(System.in).nextLine();
			a = ch.length();
			if (ch.charAt(a - 1) == 'r' && ch.charAt(a - 2) == 'e')
			{
				ch = ch.substring(0, a - 1);
				ch = ch.substring(0, a - 2);
			}
			if (ch.charAt(a - 1) == 121 && ch.charAt(a - 2) == 108)
			{
				ch = ch.substring(0, a - 1);
				ch = ch.substring(0, a - 2);
			}
			if (ch.charAt(a - 1) == 'g' && ch.charAt(a - 2) == 'n' && ch.charAt(a - 3) == 'i')
			{
				ch = ch.substring(0, a - 1);
				ch = ch.substring(0, a - 2);
				ch = ch.substring(0, a - 3);
			}
			System.out.println(ch);
		}
		return 0;
	}
}

