package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int n;
		int[] b = new int[100];
		int i;
		int j;
		int k;
		int h;
		int temp;
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
		for (i = 0,j = 0;i < n;i++)
		{
			if (a[i] % 2 == 0)
			{
			continue;
			}
			else
			{
				b[j] = a[i];
				j++;
			}
		}

		for (k = 0;k < j - 1;k++)
		{
		for (h = 1;h < j - k;h++)
		{
		if (b[h - 1] > b[h])
		{
			temp = b[h - 1];
			b[h - 1] = b[h];
			b[h] = temp;
		}
		}
		}

			System.out.printf("%d",b[0]);
			for (i = 1;i < j;i++)
			{
			System.out.printf(",%d",b[i]);
			}
			return 0;




	}
}

