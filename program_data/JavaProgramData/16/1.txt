package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (i != 0)
		{
			System.out.printf("%d",i % 10);
			i = i / 10;
		}
	}

}

