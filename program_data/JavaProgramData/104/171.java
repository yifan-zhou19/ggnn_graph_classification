package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int x;
		int y;
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		if (x == y)
		{
			System.out.printf("%d\n",x);
		}
		else if (x * y == x || x * y == y)
		{
			System.out.print("1");
		}
		else
		{
		for (i = 2;;i++)
		{
			a[0] = 0;
			a[1] = x;



			if (x % 2 == 1)
			{
				x = (x - 1) / 2;
				a[i] = x;
			}
			else
			{
				x = x / 2;
				a[i] = x;
			}
		if (x == 1)
		{
			break;
		}
		}

		b[1] = y;
		b[0] = 1;
		for (j = 2;;j++)

		{



			if (y % 2 == 1)
			{
				y = (y - 1) / 2;
				b[j] = y;
			}
			else
			{
				y = y / 2;
				b[j] = y;
			}
		   if (y == 1)
		   {
			   break;
		   }

		}
		for (k = 0;;k++)
		{
			if (a[i - k] != b[j - k])
			{
				break;
			}
		}
		System.out.printf("%d\n",a[i - k + 1]);
		}
	}

}

