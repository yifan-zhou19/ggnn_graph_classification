package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[100];
		int[] z = new int[100];
		int i;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		z[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[0] = Integer.parseInt(tempVar3);
	}
	for (i = 1;i < n;i++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			z[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			a[i] = Integer.parseInt(tempVar5);
		}
		if (((float)(a[i]) / z[i] - (float)(a[0]) / z[0]) > 0.05)
		{
			System.out.print("better\n");
		}
		else if (((float)(a[0]) / z[0] - (float)(a[i]) / z[i]) > 0.05)
		{
			System.out.print("worse\n");
		}
		else
		{
			System.out.print("same\n");
		}


	}

	}
}

