package <missing>;

public class GlobalMembers
{
	// 0001.cpp : Defines the entry point for the console application.
	//

	public static int Main()
	{
		int n;
		int i;
		int k;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = n;
		s = 0;
		while (i > 0)
		{
			k = i % 10;
			if (k == 0)
			{
				System.out.print("0"),i /= 10;
			}
			else
			{
			   i = i / 10;
			   s = s * 10 + k;
			}
		}
		System.out.printf("%d\n",s);
		return 0;
	}

}

