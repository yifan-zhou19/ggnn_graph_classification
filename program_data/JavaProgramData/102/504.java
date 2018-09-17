package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String k = new String(new char[7]);
		int n;
		int i;
		double height;
		int[] h = new int[40];
		int[] l = new int[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		int b = 0;
		int e;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				height = Double.parseDouble(tempVar3);
			}
			if (k.charAt(0) == 'm')
			{

				height = 1000 * height;
				h[a] = (int)height;

				a++;
			}
			else
			{

				height = 1000 * height;
				l[b] = (int)height;

				b++;
			}
		}
		int j;
		for (i = 1;i <= a;i++)
		{
			for (j = 0;j < a - i;j++)
			{
				if (h[j] > h[j + 1])
				{
					e = h[j];
					h[j] = h[j + 1];
					h[j + 1] = e;
				}
			}
		}
			for (i = 1;i <= b;i++)
			{
			for (j = 0;j < b - i;j++)
			{
				if (l[j] > l[j + 1])
				{
					e = l[j];
					l[j] = l[j + 1];
					l[j + 1] = e;
				}
			}
			}
			for (i = 0;i <= a - 1;i++)
			{
				e = h[i];
				height = 1.0 * e * 0.001;
				if (i == 0)
				{
					System.out.printf("%.2lf",height);
				}
				else
				{
					System.out.printf(" %.2lf",height);
				}
			}
			for (i = b - 1;i >= 0;i--)
			{
				e = l[i];
				height = 1.0 * e * 0.001;
				System.out.printf(" %.2lf",height);
			}
			return 0;
	}

}

