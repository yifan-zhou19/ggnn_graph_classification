package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int n;
		int m;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[0] != -1)
		{
			i = 1;
			n = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[1] = Integer.parseInt(tempVar2);
			}
			while (a[i] != 0)
			{
				n++;
				i++;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[i] > a[j])
					{
						t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}
			}

	/*for(i=0;i<n;i++)printf("%d ",a[i]);
	printf("\n");*/
					 m = 0;
					for (i = 0;i < n;i++)
					{
						for (j = i + 1;j < n;j++)
						{
						if (a[j] == 2 * a[i])
						{
							m++;
							break;
						}
						}
					}
						System.out.printf("%d\n",m);
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a[0] = Integer.parseInt(tempVar4);
	}
		}
	}

}

