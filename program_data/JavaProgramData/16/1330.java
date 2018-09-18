package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		do
		{
			System.out.printf("%d",i % 10);
			i = i / 10;

		}while (i != 0);
			return 0;
	}

}

