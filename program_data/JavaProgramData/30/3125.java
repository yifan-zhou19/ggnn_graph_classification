package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i = 1;
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			a = (i / 10) % 10;
			if ((!(i % 7 == 0)) && (!(i % 10 == 7)) && (!(a == 7)))
			{
				result += i * i;
			}
			i++;
		}
		System.out.printf("%d\n",result);
		return 0;
	}


}

