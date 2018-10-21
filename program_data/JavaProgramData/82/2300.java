package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
				if (a[i] >= 90 && a[i] <= 140 && b[i]>59 && b[i] <= 90)
				{
					d = i;
					for (j = d + 1;j < n;j++)
					{
						if (a[j] >= 90 && a[j] <= 140 && b[j]>59 && b[j] <= 90 && a[j - 1] >= 90 && a[j - 1] <= 140 && b[j - 1]>59 && b[j - 1] <= 90)
						{
							e = j;
						}
						else
						{
							break;
						}
					}
					f = e - d + 1;
					if (f > c)
					{
						c = f;
					}

				}

		}

		System.out.printf("%d",c);

		return 0;

	}


}

