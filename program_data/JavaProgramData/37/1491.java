package <missing>;

public class GlobalMembers
{
	public static void search()
	{
		String s = new String(new char[100]);
		int i;
		int j;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			k = 0;
			for (j = 0;j < s.length();j++)
			{
			if (s.charAt(i) == s.charAt(j))
			{
				k++;
			}
			}
			if (k == 1)
			{
				break;
			}
		}
		if (k > 1)
		{
			System.out.print("no\n");
		}
			else
			{
		System.out.printf("%c\n",s.charAt(i));
			}
	}

	public static int Main()
	{
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.in.read();
			while (n > 0)
			{
				search();
				n--;
			}
			return 0;
	}
}

