package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int g;
		int s = 0;
		int i;
		int S = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			 if (n < 100)
			 {
		for (i = 1;i <= n;i++)
		{
			g = i % 10;
			s = i / 10;
			if (g != 7 && s != 7 && i % 7 != 0)
			{
				S += Math.pow(i,2);
			}
		}
			 }
		System.out.printf("%d\n",S);
		  return 0;
	}

}

