package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int sum;
		String s = new String(new char[220]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			if (sum == 0)
			{
				System.out.printf("%s",s);
				sum = l;
			}
			else if (sum + 1 + l > 80)
			{
				System.out.printf("\n%s",s);
				sum = l;
			}
			else
			{
				System.out.printf(" %s",s);
				sum = sum + 1 + l;
			}
		}
		return 0;
	}

}

