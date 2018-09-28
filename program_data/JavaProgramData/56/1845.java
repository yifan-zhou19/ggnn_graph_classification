package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		i = 1;
		while (i != 0)
		{
			n = a % 10;
			i = a / 10;
			a = i;
			System.out.printf("%d",n);
		}
	}

}

