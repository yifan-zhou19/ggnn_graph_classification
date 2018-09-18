package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int x = 0;
		int y = 1;
		int a = 0;
		float[] n = new float[20];
		do
		{
			i = 0;
			j = 0;
			k = 0;
			x = 0;
			y = 1;
			do
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n[j] = Float.parseFloat(tempVar);
				}
				if (n[j] == 0F || n[j] == -1F)
				{
					break;
				}
				j++;
			}while (j < 20);
			if (n[j] == -1F)
			{
				return 0;
			}
			do
			{
				do
				{
					if (n[x] == n[y] * 2 || n[x] == n[y] / 2)
					{
						i++;
					}
					y++;
				}while (y < j);
				x++;
				y = x + 1;
			}while (x < j);
			System.out.printf("%d\n",i);
		}while (a < 1);
		return 0;
	}
}

