package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] x = new int[10000];
		int A;
		int B;
		int n;
		int s = 0;
		int k = 0;
		int trigger;
		int max;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < 10000;i++)
		{
			x[i] = 0;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}


		for (j = 0;j < n;j++)
		{

			for (i = a[j];i < b[j];i++)
			{
				x[i] = 1;
			}

		}

		for (i = 0;x[i] == 0;i++)
		{
			A = i + 1;
		}

		for (i = 9999;x[i] == 0;i--)
		{
			B = i;
		}

		for (i = A;i < B;i++)
		{

			if (x[i] == 0)
			{

				System.out.print("no");
				return 0;

			}

		}

		System.out.printf("%d %d",A,B);

		return 0;
	}




}

