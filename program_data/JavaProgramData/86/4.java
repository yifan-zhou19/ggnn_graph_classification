package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int t;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			c = 0;
			t = 0;
			for (j = 0;j < a;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
				t = b + 3 * j;
				if (t <= 60)
				{
					c = b;
				}
				else
				{
					t = c + 3 * j - 3;
					break;
				}
			}
			for (j++;j < a;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					d = Integer.parseInt(tempVar4);
				}
			}
				if (t < 57)
				{
					c += 57 - t;
				}
				if (a == 0)
				{
					c += 3;
				}
			System.out.printf("%d\n",c);
		}
		return 0;
	}
}

