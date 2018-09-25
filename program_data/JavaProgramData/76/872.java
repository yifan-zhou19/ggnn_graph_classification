package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//	int min;
	//	int max;
	//	}
	//	a[100],b[100],c[100];
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
				a[i].min = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].max = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j].min > a[j + 1].min)
				{
					b[j] = a[j + 1];
					a[j + 1] = a[j];
					a[j] = b[j];
				}
			}
		}
		c[0].max = a[0].max;
		for (i = 0;i < n - 1;i++)
		{
			if (c[0].max >= a[i + 1].min && c[0].max >= a[i + 1].max)
			{
		c[0].min = a[0].min;
		c[0].max = c[0].max;
			}
			else if (c[0].max < a[i + 1].min)
			{
			c[0].min = 0;
			c[0].max = 0;
			break;
			}
			else if (c[0].max >= a[i + 1].min && c[0].max < a[i + 1].max)
			{
		c[0].min = a[0].min;
		c[0].max = a[i + 1].max;
			}
		}
		if (c[0].max != 0)
		{
			System.out.printf("%d %d",c[0].min,c[0].max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

