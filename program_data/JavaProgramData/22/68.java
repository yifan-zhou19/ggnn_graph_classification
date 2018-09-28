package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n = 1;
		int max;
		int k;
		int d;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;System.in.read() != '\n';i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		n++;
		}

		max = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
			max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
		 if (a[i] == max)
		 {
		 a[i] = 0;
		 }
		}

		k = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > k)
			{
				k = a[i];
			}
		}
			if (n == 1)
			{
				System.out.print("No");
			}

			else if (k != 0)
			{
			System.out.printf("%d",k);
			}
			else
			{
			System.out.print("No");
			}



	}
}

