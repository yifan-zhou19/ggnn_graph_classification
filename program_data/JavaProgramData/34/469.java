package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int t;
		int i = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = n;
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
		while (i != 1)
		{
			if (s % 2 == 0)
			{
				t = s / 2;
				System.out.printf("%d/2=%d\n",s,t);
				s = t;
			}
			else
			{
				t = s * 3 + 1;
				System.out.printf("%d*3+1=%d\n",s,t);
				s = t;
			}
			i = s;
		}
		System.out.print("End\n");
		}
		return 0;
	}


}

