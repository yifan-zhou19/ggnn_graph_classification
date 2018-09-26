package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] fei = new int[20];
		int n;
		int i;
		int[] input = new int[20];
		int[] output = new int[20];
		fei[0] = 1;
		fei[1] = 1;
		for (i = 2;i < 20;i++)
		{
			fei[i] = fei[i - 1] + fei[i - 2];
		}
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
				input[i] = Integer.parseInt(tempVar2);
			}
			output[i] = fei[input[i] - 1];
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",output[i]);
		}
		return 0;
	}
}

