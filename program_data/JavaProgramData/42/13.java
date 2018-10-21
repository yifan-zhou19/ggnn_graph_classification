package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b;
		int c;
		int n;
		int i;
		int j;
		int[] q = new int[1000000];
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
			q[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			c = 0;
			if (q[i] == b)
			{
				for (j = i;j < n;j++)
				{
				q[j] = q[j + 1];
				}
				c = 1;
			}
			if (c == 1)
			{
				n = n - 1;
			i = i - 1;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%ld ",q[i]);
		}
		System.out.printf("%ld",q[n - 1]);
	}
}

