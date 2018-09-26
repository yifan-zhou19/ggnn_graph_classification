package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int a;
		int b;
		int[] d = new int[13];
		int i;
		int j;

		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			d[i] = 0;
			for (j = 1;j < i;j++)
			{
				d[i] = d[i] + m[j];
			}
			d[i] = d[i] + 13;
			a = (d[i] + w - 2) % 7 + 1;
			if (a == 5)
			{
				System.out.printf("%d\n",i);
			}
		}

	}
}

