package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[6];
		int i;
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		b[0] = m;
		for (i = 0;i < 6;i++)
		{
			n[i] = (int)b[i] / a[i];
			b[i + 1] = b[i] % a[i];
			System.out.printf("%d\n",n[i]);
		}
		return 0;
	}
}

