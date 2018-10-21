package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int cal = new int(int s,int t);
		int[][] a = new int[5][5];
		int i;
		int n;
		int m;
		(int)(*p)[5];
		int temp;
		for (p = a;p < a + 5;p++)
		{
			for (i = 0;i < 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*p + i = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (cal(n, m) == 0)
		{
			System.out.print("error");
		}
		if (cal(n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				temp = (*(a + n) + i);
				*(*(a + n) + i) = *(*(a + m) + i);
				*(*(a + m) + i) = temp;
			}
			for (p = a;p < a + 5;p++)
			{
				for (i = 0;i < 4;i++)
				{
					System.out.printf("%d ",*(*p + i));
				}
				System.out.printf("%d\n",*(*p + 4));
			}
		}
	}


		public static int cal(int s,int t)
		{
			int c;
			if (0 <= s != 0 && s <= 4 && 0 <= t != 0 && t <= 4)
			{
				c = 1;
			}
			else
			{
				c = 0;
			}
			return (c);
		}
}

