package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100000][2];
	public static int[] b = new int[100000];
	public static int c = 0;
	public static int f = 0;
	public static int e = 0;
	public static int i = 0;
	public static int m = 0;
	public static int t = 0;
	public static int n = 0;
	public static int Main()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		for (i = 0;i < e;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][0] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i][1] = Integer.parseInt(tempVar3);
				}
		}

		for (i = 0;i < e;i++)
		{
			 for (m = a[i][0];m < a[i][1];m++)
			 {
					   b[2 * m] = 1;

					   b[2 * m + 1] = 1;

			 }
			 b[2 * m] = 1;

		}
		for (i = 1;i <= 100000;i++)
		{
			 if (b[i] == 1)
			 {
				 t = i;
			 }
		}
		for (i = 100000;i > 0;i--)
		{
			 if (b[i] == 1)
			 {
				n = i;
			 }
		}
		f = 0;

		for (i = n;i <= t;i++)
		{
			 if (b[i] == 0)
			 {
				 f = 1;
			 }

		}
		if (f == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",n / 2,t / 2);
		}

	return 0;
	}

}

