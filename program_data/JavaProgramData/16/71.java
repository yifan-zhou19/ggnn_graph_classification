package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int[] num = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n / 10 != 0)
		{
			   num[i++] = n % 10;
			   n /= 10;
		}
		num[i] = n;
		for (int m = 0;m <= i;m++)
		{
		System.out.printf("%d",num[m]);
		}
	System.out.print("\n");
	}

}

