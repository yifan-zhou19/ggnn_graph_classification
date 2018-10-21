package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = 0;
		int n;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1;
			if (a[i] % 7 == 0 || a[i] % 10 == 7 || (int)a[i] / 10 == 7)
			{
				continue;
			}
			else
			{
				s += a[i] * a[i];
			}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

