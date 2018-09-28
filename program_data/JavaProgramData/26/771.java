package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int i;
		int[] k = new int[100];
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		String p = null;
		p = str;
		for (i = 0;p.charAt(i);i++)
		{
			if (p.charAt(i) == ' ' && p.charAt(i + 1) == ' ')
			{
				k[i + 1] = 1;
			}
			if (k[i] != 1)
			{
			System.out.print(p.charAt(i));
			}
		}


		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

