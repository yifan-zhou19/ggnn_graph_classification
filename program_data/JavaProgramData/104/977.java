package <missing>;

public class GlobalMembers
{
	public static int pre(int num)
	{
		if (num == 1)
		{
			return 0;
		}
		else
		{
			if (num % 2 != 0)
			{
				return (num - 1) / 2;
			}
			else
			{
				return num / 2;
			}
		}
	}

	public static void Main()
	{
		int n;
		int m;
		int[] x = new int[100];
		int[] y = new int[100];
		int i;
		int j;
		int k;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		x[0] = n;
		y[0] = m;
		for (i = 1;;i++)
		{
			x[i] = pre(x[i - 1]);
			if (x[i] == 0)
			{
				break;
			}
		}
		for (j = 1;;j++)
		{
			y[j] = pre(y[j - 1]);
			if (y[j] == 0)
			{
				break;
			}
		}
		for (k = 0;k < i;k++)
		{
			for (d = 0;d < j;d++)
			{
				if (x[k] == y[d])
				{
					System.out.printf("%d",x[k]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto L;
				}
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	L:
		System.out.print("\n");
	}




}

