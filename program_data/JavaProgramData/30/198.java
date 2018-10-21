package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		int[] a = new int[100];
		int b;
		int c;
		int sum = 0;
		for (i = 1;i <= n;i++)
		{
			b = i % 10;
		c = (i - b) / 10;
		if ((i % 7 != 0) && (b != 7) && (c != 7))
		{
			sum += i * i;
		}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

