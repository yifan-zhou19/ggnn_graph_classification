package <missing>;

public class GlobalMembers
{
	public static void Bubble(int[] a, int n)
	{
		int i;
		int j;
		int temp1;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp1 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp1;
				}
			}
		}
	}
	public static void Main()
	{
		int i;
		int n;
		int t = 0;
		int[] a = new int[500];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 != 0)
			{
				b[t] = a[i];
				t++;
			}
		}
		Bubble(b, t);
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d%c",b[i],(i == t - 1)?'\n':',');
		}
	}
}

