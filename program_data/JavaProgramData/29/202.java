package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			int j = 0;
			int a = 1;
			int b = 2;
			int d;
			float c;
			float sum = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				c = (float)b / a;
				d = b;
				b += a;
				a = d;
				sum += c;
			}
				System.out.printf("%.3f\n",sum);
		}
		return 0;
	}

}

