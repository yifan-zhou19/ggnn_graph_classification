package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		System.out.printf("%s", a);
		count = a.length();
		for (i = 2; i <= n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = tempVar3.charAt(0);
			}
			if (a.charAt(0) == 'k')
			{
				System.out.print("");
			}
			count = count + 1 + a.length();
			if (count <= 80)
			{
				System.out.printf(" %s", a);
			}
			else
			{
				System.out.printf("\n%s", a);
				count = a.length();
			}
		}
		System.out.print("\n");
		return 0;
	}

}

