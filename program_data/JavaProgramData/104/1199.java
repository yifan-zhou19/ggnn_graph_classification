package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		int xi;
		int yj;
		int i;
		int j;
		for (i = 0;i < 15;i++)
		{
			xi = x / (Math.pow(2,i));
			for (j = 0;j < 15;j++)
			{
				yj = y / (Math.pow(2,j));
				if (yj == xi)
				{
					System.out.printf("%d\n",yj);
				break;
				}
			}
			if (yj == xi)
			{
				break;
			}
		}
		return 0;

	}

}

