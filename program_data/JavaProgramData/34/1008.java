package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int x;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = n;
		for (i = 1;i <= 1000;i++)
		{
			if ((x != 1) && (x % 2 == 1))
			{
				m = x * 3 + 1;
				System.out.printf("%d*3+1=%d\n",x,m);
				x = m;
			}
			else if ((x != 1) && (x % 2 == 0))
			{
				m = x / 2;
				System.out.printf("%d/2=%d\n",x,m);
				x = m;
			}
			else if (x == 1)
			{
				System.out.print("End");
				break;
			}
		}
	}

}

