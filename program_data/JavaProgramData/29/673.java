package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int z;
	int m;
	int[] a = new int[100];
	float val;

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
			a[i] = Integer.parseInt(tempVar2);
		}
	}

	for (i = 0;i < n;i++)
	{
		val = 0F;
	 z = 2;
	 m = 1;
		for (j = 0;j < a[i];j++)
		{
			val = val + (float)z / (float)m;
			z = m + z;
			m = z - m;
		}
	System.out.printf("%.3f\n",val);
	}
	return 0;
	}
}

