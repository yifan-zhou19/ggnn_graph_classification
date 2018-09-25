package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int a;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		c = a;
		while (c >= 1)
		{
		d = c - (c / 10) * 10;
		c = c / 10;
		System.out.printf("%d",d);

		}
		if (a == 0)
		{
		System.out.print("0");
		}
	}
}

