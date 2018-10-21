package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] b = new int[100];
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		if (b[1] < b[2])
		{
			c = b[1];
			b[1] = b[2];
			b[2] = c;
		}
		else
		{
			if (b[i] >= b[1])
			{
				c = b[2];
				b[2] = b[1];
				b[1] = b[i];
			}
			else
			{
				if (b[i] >= b[2])
				{
					c = b[2];
					b[2] = b[i];
				}
			}
		}
		}
		System.out.printf("%d\n",b[1]);
		System.out.printf("%d\n",b[2]);
		return 0;
	}
}

