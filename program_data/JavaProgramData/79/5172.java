package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f;
		int m;
		int n;
		int i;
		int t = 0;
		int[] a = new int[100];
		do
		{
			f = 1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 2;i <= n;i++)
			{
				f = (f + m - 1) % i + 1;
			}
			a[t] = f;
			t++;
		} while (m != 0 || n != 0);
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}
}

