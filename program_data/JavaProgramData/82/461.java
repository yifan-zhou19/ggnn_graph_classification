package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
			i++;
		}
		y = 0;

		i = 0;
		while (i < n)
		{
			x = 0;
			while (i < n)
			{
			  if ((a[i]) >= 90 && (a[i]) <= 140 && (b[i]) >= 60 && (b[i]) <= 90)
			  {
				  x++;
			  }
			  else
			  {
				  break;
			  }
			  i++;
			}
			if (x >= y)
			{
				y = x;
			}
		i++;
		}
		if (n == 1)
		{
			if ((a[0]) >= 90 && (a[0]) <= 140 && (b[0]) >= 60 && (b[0]) <= 90)
			{
			System.out.print("1");
			}
		else
		{
			System.out.print("0");
		}
		}
		else
		{
			System.out.printf("%d",y);
		}
		return 0;
	}

}

