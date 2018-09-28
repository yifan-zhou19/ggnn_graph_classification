package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int e;
		int f;
		int h;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
			for (j = 0;j < m;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
			e = a[j] + 3 * j;
			h = e+3;


			if (e <= 60 && h < 60)

			{

					f = 60 - 3 * (j + 1);
					continue;
			}

			if (e <= 60 && h >= 60)
			{
			f = a[j];

			}
			continue;
			if (e > 60)
			{
			f = 60 - 3 * j;
			continue;
			}



			}
			System.out.printf("%d\n",f);



			}
		}

		return 0;
	}

}

