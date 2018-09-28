package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w;
		int i;
		int j;
		int m;
		int[] b = new int[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0; i < 12; i++)
		{
			m = 12;
			for (j = 0; j < i; j++)
			{
				m += a[j];
			}
			b[i] = (m % 7 + w) % 7;
			if (b[i] == 5)
			{
				System.out.printf("%d\n",i + 1);
			}

		}
		return 0;
	}



}

