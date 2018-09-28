package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] a = new int[100][100];
		float[] b = new float[100];
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			b[i] = (float)a[i][1] / a[i][0];
		}
		for (i = 1;i < n;i++)
		{
			if (b[0] - b[i] > 0.05F)
			{
				System.out.print("worse");

			}
			else if (b[i] - b[0] > 0.05F)
			{
				System.out.print("better");
			}
			else
			{
				System.out.print("same");
			}
			System.out.print("\n");
		}
		return 0;
	}
}

