package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shu = new int[20];
		int[] fei = new int[20];
		int[] chu = new int[20];
		int n;
		int i;
		int j;
		int b;
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
				shu[i] = Integer.parseInt(tempVar2);
			}
		}
		fei[0] = 1;
		fei[1] = 1;
		for (j = 2;j < 20;j++)
		{
			fei[j] = fei[j - 1] + fei[j - 2];
		}
		for (b = 0;b < n;b++)
		{
			chu[b] = fei[shu[b] - 1];
			System.out.printf("%d\n",chu[b]);
		}
		return 0;
	}

}

