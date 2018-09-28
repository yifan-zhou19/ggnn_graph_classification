package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int x;
		int y;
		int[] a = new int[301];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;System.in.read() != '\n';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		k = i;
		for (j = 0;1;j++)
		{
			if (a[j] != a[j + 1])
			{
				break;
			}
		}
		if (i == 1 || j + 1 == i)
		{
			System.out.print("No");
		}
		else
		{
			x = a[0];
			y = 0;
			for (i = 1;i < k;i++)
			{
				if (x < a[i])
				{
					x = a[i];
				}
			}
			for (i = 0;i < k;i++)
			{
				if (y < a[i] && a[i] != x)
				{
					y = a[i];
				}
			}
			System.out.printf("%d",y);
			//printf("\n%d",x);
		}
	}
}

