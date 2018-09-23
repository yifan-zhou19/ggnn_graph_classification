package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int i = 1;
		int j = 1;
		int x;
		int y;
		int count = 0;
		int judge = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		while (x != 0)
		{
			a[i] = x;
			x = x / 2;
			i++;
		}
		while (y != 0)
		{
			b[j] = y;
			y = y / 2;
			j++;
			count++;
		}
		for (i = 1;i < 100;i++)
		{
			for (j = 1;j <= count;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					judge = 1;

					break;
				}
			}
			if (judge == 1)
			{
				break;
			}


		}

	}

}

