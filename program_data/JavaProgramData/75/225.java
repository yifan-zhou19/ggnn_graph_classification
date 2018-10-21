package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int max = int array[];
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] a = new int[1000];
		int num;
		int i;
		int j;
		for (i = 0;i < 1000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		num = i + 1;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < num;j++)
			{
				if (x[j] <= i != 0 && y[j]> i)
				{
					a[i] = a[i] + 1;
				}
			}
		}
		System.out.printf("%d %d\n",num,max(a));
		return 0;
	}

	public static int max(int[] array)
	{
		int x = 0;
		int i;
		for (i = 0;i < 1000;i++)
		{
			if (array[i] > x)
			{
				x = array[i];
			}
		}
		return (x);
	}
}

