package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		int[] a = {12, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int b;
		int c;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		while (i <= 11)
		{
		   b = a[i] % 7 + w;
		   c = b % 7;
		if (c == 5)
		{
			System.out.printf("%d\n",i + 1);
			i = i + 1;
			a[i] = a[i] + a[i - 1];
		}
		else
		{
			i = i + 1;
			a[i] = a[i] + a[i - 1];
		}
		}

	}
}

