package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int a;
		int c;
		int t;
		int i;
		int j;
		int[] b = new int[50];
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			t = 0;
			c = 60;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				t = a + (j + 1) * 3;
				if (t > 59)
				{
					j++;
					break;
				}
				c -= 3;
			}
			for (;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					d = Integer.parseInt(tempVar4);
				}
			}
			if (t > 59 && t < 64)
			{
				b[i] = a;
			}
			else
			{
				b[i] = c;
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}

