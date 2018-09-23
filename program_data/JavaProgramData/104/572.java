package <missing>;

public class GlobalMembers
{
	public static int func(int a)
	{
		if (a % 2 == 0)
		{
			a = a / 2;
		}
		else
		{
			a = (a - 1) / 2;
		}
		return (a);
	}
	public static int Main()
	{
		int x; //x,y???????
		int y;
		int[] a = new int[10]; //a,b???????????
		int[] b = new int[10];
		int i;
		int j;
		int flag = 1;
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
		a[0] = x;
		b[0] = y;
		for (i = 1;i < 10;i++)
		{
			a[i] = func(x);
			x = a[i];
			if (x == 1)
			{
				break;
			}
		}
		for (i = 1;i < 10;i++)
		{
			b[i] = func(y);
			y = b[i];
			if (y == 1)
			{
				break;
			}
		}
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d",a[i]);
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				break;
			}
		}
		return 0;
	}

}

