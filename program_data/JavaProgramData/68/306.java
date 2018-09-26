package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int j;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1,c = 6;i <= (n / 2 - 2);i++,c++,c++)
		{
			for (m = 3;;m++,m++)
			{
				for (a = 1;a <= Math.sqrt(m);a++,a++)
				{
					if (m % a == 0)
					{
						k = a;
					}
				}
				for (b = 1;b <= Math.sqrt(c - m);b++,b++)
				{
					if ((c - m) % b == 0)
					{
						j = b;
					}
				}
				if (k == 1 && j == 1)
				{
					break;
				}
			}
		System.out.printf("%d=%d+%d\n",c,m,c - m);
		}
		return 0;
	}
}

