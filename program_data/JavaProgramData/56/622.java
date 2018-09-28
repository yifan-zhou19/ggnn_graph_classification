package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int i = 1;
		int j = 1;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		while (b > 9)
		{
			a[i] = b % 10;
			b = b / 10;
			i = i + 1;
		}
		a[i] = b;
		for (j = 1;j < (i + 1);j++)
		{
			System.out.printf("%d",a[j]);
		}
	}
}

