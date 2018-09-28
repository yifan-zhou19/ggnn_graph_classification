package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int sum = 0;
		int m;
		String word = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			m = word.length() + 1;
			sum = sum + m;
			if ((sum > 81) || (i == 1))
			{
				System.out.print("\n");
				sum = m;
				System.out.printf("%s",word);
			}
			else
			{
				System.out.printf(" %s",word);
			}
		}
		System.out.print("\n");
	}
}

