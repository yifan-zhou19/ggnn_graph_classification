package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String word = new String(new char[41]);
		String words = new String(new char[41]);
		int n;
		int s = 0;
		int l;
		int i;
		int x = 90;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			l = word.length();
			if (i == 1)
			{
				s = l;
				System.out.printf("%s",word);
				continue;
			}
			s = s + l + 1;
			if (s <= 80)
			{
				System.out.printf(" %s",word);
			}
			else
			{
				System.out.printf("\n%s",word);
				s = l;
			}

		}
	}
}

