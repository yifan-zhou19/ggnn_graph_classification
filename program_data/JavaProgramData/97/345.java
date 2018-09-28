package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int m;
		int i;
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] n = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 6;i++)
		{
			n[i] = m / a[i];
			m = m - n[i] * a[i];
			System.out.printf("%d\n",n[i]);
		}
	}

}

