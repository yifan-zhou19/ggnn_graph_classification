package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int b;
		int c;
		int j;
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
					a[i] = Integer.parseInt(tempVar2);
				}
		}
		for (i = 0,b = 0;i < n;i++)
		{
			c = 1;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					c = 0;
				}
			}

				if (c != 0)
				{
					if (b > 0)
					{
						System.out.print(",");
					}
					System.out.printf("%d",a[i]);
					b++;
				}
		}
	}
}

