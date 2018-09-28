package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[10000];
		int b;
		int c;
		int d;
		int e;
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
			}
			b = 0;
			c = 0;
			d = 0;
			e = 0;
			for (i = 0;i < n;i++)

			{

				if (a[i] <= 18)
				{
					b = b++;
				}

				else if (a[i] > 18 && a[i] <= 35)
				{
				c++;
				}

				else if (a[i] > 35 && a[i] <= 60)
				{
					d++;
				}
				else
				{
					e++;
				}
			}
			System.out.printf("1-18: %.2f%\n",(float)b / n * 100);
			System.out.printf("19-35: %.2f%\n",(float)c / n * 100);
			System.out.printf("36-60: %.2f%\n",(float)d / n * 100);
			System.out.printf("60??: %.2f%\n",(float)e / n * 100);
	}
}

