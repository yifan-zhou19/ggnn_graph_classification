package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int x;
		int y;
		int[] a = new int[1002];
		int[] b = new int[1002];
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;x > 0;i++)
		{
			a[i] = x;
			x = x / 2;
		}
		for (j = 0;y > 0;j++)
		{
			b[j] = y;
			y = y / 2;
		}
			if (i > j)
			{
		for (m = 0;m < j;m++)
		{
			if (a[i - j] == b[m])
			{
				break;
			}
			i++;
		}
		System.out.printf("%d",b[m]);
			}
		else
		{
		for (m = 0;m < i;m++)
		{
			if (a[m] == b[j - i])
			{
				break;
			}
			j++;
		}
		System.out.printf("%d",a[m]);
		}



	}
}

