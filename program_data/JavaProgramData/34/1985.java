package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 1;
		int b = 1;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = a;i != 1;i = b)
		{
		if (i % 2 == 0)
		{
		   b = i / 2;
		System.out.printf("%d/2=%d\n",i,i / 2);
		}
		else
		{
			b = i * 3 + 1;
		System.out.printf("%d*3+1=%d\n",i,i * 3 + 1);
		}
		}
		System.out.print("End");

	}
}

