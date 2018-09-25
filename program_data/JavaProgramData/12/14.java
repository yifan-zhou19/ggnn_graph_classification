package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] c = new int[15];
		int i;
		int m = 0;
		for (i = 0;i < 15;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[i] = Integer.parseInt(tempVar);
			}
			if (c[i] == 0)
			{
				break;
			}
		}

		int k;
		int j;
		int n = 0;
		for (k = 0;c[k] != 0;k++)
		{
			for (j = 0;c[j] != 0;j++)
			{

				if (c[k] == 2 * c[j])
				{
					n++;

				}
			}

		}
		System.out.printf("%d",n);
	}
}

