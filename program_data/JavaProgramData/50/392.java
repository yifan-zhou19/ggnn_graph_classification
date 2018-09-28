package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int count = 0;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] d = new int[13];
		int[] a = new int[12];
		int[] b = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			d[i] = d[i] + m[i];
			d[i + 1] = d[i];
			b[i] = (13 + d[i] + w) % 7 - 1;
			if (b[i] == 5)
			{
				count++;
				a[count] = i + 1;
			}
		}
		for (i = 1;i <= count;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}
}

