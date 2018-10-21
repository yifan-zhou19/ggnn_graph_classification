package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int[] as = new int[100];
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				as[i] = Integer.parseInt(tempVar2);
			}
		i++;
		}
	int[] zx = new int[100];
	i = 0;
	while (i < n)
	{
		zx[i] = as[i];
		i++;
	}
	i = n - 1;
	while (i > 0)
	{
		System.out.printf("%d ",zx[i]);
			i--;
	}
	System.out.printf("%d",zx[0]);
	}
}

