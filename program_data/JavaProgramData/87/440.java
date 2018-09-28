package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shuru = new int[10];
		int i;
		int j;
		int k;
		int a;
		int b;
		int kong = 1;
		int c;
			for (i = 0;kong != 0;i++)
			{
				for (j = 0;j < 6;j++)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						shuru[j] = Integer.parseInt(tempVar);
					}
				}
				if (shuru[0] == 0 && shuru[1] == 0 && shuru[2] == 0 && shuru[3] == 0 && shuru[4] == 0 && shuru[5] == 0)
				{
					kong = 0;
					return 0;
				}
				else
				{
					a = shuru[0] * 3600 + shuru[1] * 60 + shuru[2];
					b = (shuru[3] + 12) * 3600 + shuru[4] * 60 + shuru[5];
					c = b - a;
					System.out.printf("%d\n",c);
				}

			}
			return 0;
	}
}

