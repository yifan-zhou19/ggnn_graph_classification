package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
		for (i = 1;i <= n;i++)
		{
		   if (i % 7 && i / 10 != 7 && i % 10 != 7)
		   {
			   s += i * i;
		   }
		}
		System.out.printf("%d\n",s);
		return 0;
	}

}

