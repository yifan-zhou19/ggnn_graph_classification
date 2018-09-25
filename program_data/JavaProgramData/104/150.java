package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int[] b = new int[100];

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
		for (i = 0;x > 0;i++)
		{
			a[i] = x;
			x = x / 2;
		}
		i = i - 1;
		for (j = 0;y > 0;j++)
		{
			b[j] = y;
			y = y / 2;
		}
		j = j - 1;
		for (k = 0;k <= i != 0 && k <= j;k++)
		{
			if (a[i - k] != b[j - k])
			{
		break;
			}
		}
		if (a[i - k] != b[j - k])
		{
			System.out.printf("%d",a[i - k + 1]);
		}
		else if (k == i + 1)
		{
			System.out.printf("%d",a[0]);
		}
		else if (k == j + 1)
		{
			System.out.printf("%d",b[0]);
		}




	}

}

