package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int t;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a = i % 10;
			t = i / 10;
			b = t % 10;
			if (a != 7 && b != 7 && i % 7 != 0)
			{
				s += Math.pow(i,2);
			}
		}
		System.out.printf("%d\n",s);
	}

}

