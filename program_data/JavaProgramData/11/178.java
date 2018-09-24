package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int d1 = 0;
		int d2;
		int i;
		int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (m == 1)
		{
			d2 = d;
		}
		else
		{

			for (i = 0;i < m - 1;i++)
			{
				 d1 = d1 + md[i];
			}
			d2 = d + d1;

		}
		System.out.printf("%d",d2);

	   return 0;
	}
}

