package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int first;
		int second = 0;
		char a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			first = Integer.parseInt(tempVar);
		}
		while (scanf("%c", a) && a == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n > first)
			{
				second = first;
				first = n;
			}
			else if (n == first)
			{
				second = second;
			}
			else if (n > second)
			{
				second = n;
			}
		}
		if (second == 0)
		{
				System.out.print("No\n");
		}
		else
		{
				System.out.printf("%d\n",second);
		}
		return 0;
	}
}

