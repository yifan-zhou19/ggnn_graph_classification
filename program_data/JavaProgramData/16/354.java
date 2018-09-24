package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n;
		do
		{
			a = b % 10;
			c = b;
			b = b / 10;
			System.out.printf("%d",a);
		} while (c / 10 != 0);
		return 0;
	}

}

