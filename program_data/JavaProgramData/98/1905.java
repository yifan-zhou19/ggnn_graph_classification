package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int p = 0;
		int m = 0;
		int i;
		String word = new String(new char[60]);
		String s = new String(new char[60]);
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
				word = tempVar2.charAt(0);
			}
			m = word.length();
			if (p + m > 80)
			{
				System.out.print("\n");
				p = 0;
			}
			else if (i > 0)
			{
				System.out.print(" ");
			}
			p = p + m + 1;
			s = word;
			System.out.print(s);
		}
		System.out.print("\0");
	}
}

