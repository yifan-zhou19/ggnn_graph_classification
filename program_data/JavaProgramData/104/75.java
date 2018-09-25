package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int x;
		int y;
		int i;

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

		for (i = 0;i < 1001;i++)
		{
			a[i] = 0;
		}
		for (;x > 0;)
		{
			a[x] = 1;
			x = x / 2;
		}
		for (;y > 0;)
		{

			if (a[y] == 1)
			{
				System.out.printf("%d\n",y);
				break;
			}
			y = y / 2;
		}

		return 0;
	}


}

