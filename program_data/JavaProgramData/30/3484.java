package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[2];
		int s = 0;
		int x = 0;
		int i = 0;
		for (i = 1;i <= n;i++)
		{
			x = i;
			a[0] = x % 10;
			a[1] = x / 10;
			if (i % 7 == 0 || a[0] == 7 || a[1] == 7)
			{
				continue;
				i++;
			};
			s = s + i * i;
		}
		System.out.printf("%d\n",s);
	}

}

