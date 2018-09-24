package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int a1;
		int a2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		a[0] = n;


		for (i = 0;;i++)
		{
			if (a[i] == 1)
			{
				break;
			}
		//printf("%d",i);
		//printf(" %d\n",a[i]);
		a[i + 1] = a[i] / 2;
		}

		int m;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] b = new int[100];
		b[0] = m;


		for (j = 0;;j++)
		{
			if (b[j] == 1)
			{
				break;
			}
		//printf("%d",i);
		//printf(" %d\n",b[i]);
		b[j + 1] = b[j] / 2;
		}


		//printf("\n\n\n\n");
		//for(i=0;i<=99;i++)
		//printf("%d %d\n",a[i],b[i]);

		int flag;
		flag = 0;
		for (a1 = 0;a1 <= i;a1++)
		{
			if (flag == 0)
			{
			for (a2 = 0;a2 <= j;a2++)
			{
				if (flag == 0)
				{
				if (a[a1] == b[a2])
				{
				System.out.printf("%d\n",a[a1]);
				flag = 1;
				}
				}
			}
			}
		}

	}
}

