package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		int i;
		int[] a = new int[13];
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		a[0] = w;
		a[1] = a[0] + 12;
		for (i = 2;i < 13;i++)
		{
			a[i] = a[i - 1] + b[i - 2];
		}
		for (i = 1;i < 13;i++)
		{
			if (a[i] % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
	}

}

