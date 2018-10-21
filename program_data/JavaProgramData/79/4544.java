package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[1000]; //b???????????????n(?0??),???????m
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[1] = Integer.parseInt(tempVar2);
		}



		for (x = 0;b[x] != 0;x = x + 2)
		{
			int n; //n??????m???????
			int m;
			int d = 0;
			int i = 0;
			int k = 0;
			n = b[x];
			m = b[x + 1];
			int[] a = new int[999];


			for (i = 0;i < n;i++) //??n?a??????i=n
			{
				a[i] = i + 1;
			}

			for (i = 0;d < n - 1;i++)
			{
				if (i == n)
				{
					i = 0;
				}

				while (a[i] == 0)
				{
					i++;
					if (i == n)
					{
						i = 0;
					}
				}

				k++; //k?????n?

				if (k == m)
				{
					a[i] = 0;
					k = 0;
					d++;
				}
				//printf("%d %d %d %d %d %d\n",a[0],a[1],a[2],a[3],a[4],a[5]);

			}


			for (i = 0;i < n;i++)
			{
				if (a[i] != 0)
				{
				System.out.printf("%d\n",a[i]);
				}
			}


			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[x + 2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b[x + 3] = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
}

