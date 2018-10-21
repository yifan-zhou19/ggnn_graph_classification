package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int max = 0;
		int inf = 0;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (a > max)
			{
				inf = max;
				max = a;
			}
			else if (a == max)
			{
			}
			else if (a >= inf)
			{
				inf = a;
			}
		}while (c == ',');
		if (max == inf)
		{
			System.out.print("No");
		}
		else if (inf == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d", inf);
		}
		return 0;
	}

}

