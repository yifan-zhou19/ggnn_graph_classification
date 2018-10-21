package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] y = new int[300];
		int[] n = new int[300];
		int[] m = new int[300];
		int i;
		int k;
		int z;
		k = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[k] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[k] = Integer.parseInt(tempVar2);
			}
			if ((n[k] == 0) || (m[k] == 0))
			{
				break;
			}
			k++;
		}
		for (z = 0;z < k;z++)
		{
			y[z] = 0;
			for (i = 1;i < n[z];i++)
			{
				y[z] = (y[z] + m[z]) % (i + 1);
			}
			System.out.printf("%d\n",y[z] + 1);
		}
		return 0;
	}
}

