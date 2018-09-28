package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[5];
	int i;
	int j;
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 5;i > 0;)
	{
		j = (int)Math.pow(10,i - 1);
		if (n / j != 0)
		{
			break;
		}
		i--;
	}
	for (j = 0;j < i;j++)
	{
		m = (int)Math.pow(10,i - 1 - j);
	 a[j] = (int)(n / m) - 10 * ((int)(n / (10 * m)));
	}
	for (j = 0;j < i;j++)
	{
	 System.out.printf("%d",a[i - 1 - j]);
	}
	}

}

