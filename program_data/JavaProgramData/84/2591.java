package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[100];
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
			for (i = 0;i < d;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			b = a[0],c = a[1];
			for (i = 1;i < d;i++)
			{

				if (a[i] > b)
				{
					c = b;
					b = a[i];
				}
				else
				{
			if (a[i] > c)
			{
				c = a[i];

			}
				}
			}

			System.out.printf("%d\n%d\n",b,c);
		return 0;
	}
}

