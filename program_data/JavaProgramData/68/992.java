package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int b;
		int t;
		t = 1;
		for (b = 3;b <= Math.sqrt(a);b = b + 2)
		{
			if (a % b == 0)
			{
				t = 0;
				break;
			}
		}
		return t; //1shisushu,0shiheshu
	}
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int c;
		int b;
		int a;
		for (c = 6;c <= n;c = c + 2)
		{
			for (a = 3;a <= n / 2;a = a + 2)
			{
				if (sushu(c - a) != 0 && sushu(a) != 0)
				{
					System.out.printf("%d=%d+%d\n",c,a,c - a);
					break;
				}
			}
		}
	}
}

