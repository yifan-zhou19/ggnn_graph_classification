package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int t;
		int[] a = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			t = a[i] % 7;
			if ((t + n <= 8 && t + n - 1 == 5) || t + n>8 && t + n - 7 - 1 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}

}

