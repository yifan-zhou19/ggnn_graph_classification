package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int[] sz1 = new int[100];
		int[] sz2 = new int[100];
		int n;
		int[] sz = new int[100];
		int[] sza = new int[100];
		int b = 1;
		int c;
		int max;
		sz[0] = -1;
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
				sz1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz2[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz1[i] < 90 || sz1[i]>140 || sz2[i] < 60 || sz2[i]>90)
			{
				sz[b] = i;
				b = b + 1;
			}

		}
		if (n == 1)
		{
			if (b == 2)
			{
				System.out.print("0");
			}
			else
			{
				System.out.print("1");
			}
		}
		else
		{


				sz[b] = n;
		if (b > 1)
		{
			c = b;
			for (i = 0;i < c;i++)
			{
			sza[i] = sz[i + 1] - sz[i];
			}
		max = sza[0];
		for (i = 0;i < c;i++)
		{
			if (max < sza[i])
			{
				max = sza[i];
			}
		}
		System.out.printf("%d",max - 1);
		}

		else
		{
			System.out.printf("%d",n);



		}
		}



			return 0;
	}


}

