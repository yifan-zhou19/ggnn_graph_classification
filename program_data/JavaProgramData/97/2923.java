package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int b;
		int c;
		a[0] = 100;
		a[1] = 50;
		a[2] = 20;
		a[3] = 10;
		a[4] = 5;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= 4;i++)
		{
			c = b / a[i];
			b = b - c * a[i];
			System.out.printf("%d\n\n",c);
		}
			System.out.printf("%d",b);
	}
}

