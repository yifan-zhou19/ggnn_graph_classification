package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b;
		int c;
		int d;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int sn;
	//		int chi;
	//		int mat;
	//		int sum;
	//	}
	//	a[100000];
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
				a[i].sn = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].mat = tempVar4;
			}
			a[i].sum = a[i].chi + a[i].mat;
		}
		b = n;
		c = n;
		d = n;
		a[n].sum = -100;
		for (i = 0;i < n;i++)
		{
			if (a[b].sum >= a[i].sum)
			{
				b = b;
			}
			else
			{
				b = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i != b)
			{
				if (a[c].sum >= a[i].sum)
				{
					c = c;
				}
				else
				{
					c = i;
				}
			}
			else
			{
				;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i != c & i != b)
			{
				if (a[d].sum >= a[i].sum)
				{
					d = d;
				}
				else
				{
					d = i;
				}
			}
			else
			{
				;
			}
		}
		System.out.printf("%d %d\n",a[b].sn,a[b].sum);
		System.out.printf("%d %d\n",a[c].sn,a[c].sum);
		System.out.printf("%d %d\n",a[d].sn,a[d].sum);
		return 0;
	}
}

