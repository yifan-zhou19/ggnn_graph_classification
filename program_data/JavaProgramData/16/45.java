package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int s;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		s = a;
		while (s != 0)
		{
			p = s % 10;
			System.out.printf("%d",p);
			s = (s - p) / 10;
		}
		return 0;
	}
}

