package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			a = i - 3;
			b = 3;
			while (b <= Math.sqrt(a))
			{
				if (a % b == 0 || (i - a) % b == 0 && (i - a) != b)
				{
				b = 3;
				a = a - 2;
				}
				else
				{
				b = b + 2;
				}
			}
			System.out.printf("%d=%d+%d\n",i,i - a,a);
		}
	}
}

