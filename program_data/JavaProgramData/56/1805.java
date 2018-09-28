package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int d;
		int c;
		int b = 10;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (c != 0)
		{
		d = b / 10;
		c = (a % b - a % d) / d;
		b = b * 10;
		if (c != 0)
		{
		System.out.printf("%d",c);
		}
		else
		{
		break;
		}
		}
	}
}

