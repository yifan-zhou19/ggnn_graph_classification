package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int k)
	{
		int i;
		int j;
		int temp;
		int l;
		for (i = k - 1;i >= 0;i--)
		{
			for (j = 0;j <= i;j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}


	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k = 0;
		int l;
		int num;
		char c;
		i = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i = i + 1;
			 c = System.in.read();
		}while (c != '\n');
		//printf("%d",i);
		paixu(a, i);
		if (i == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 0;j < i - 1;j++)
			{
				if (a[j] != a[j + 1])
				{
					k = 1;
				}
			}
			if (k == 0)
			{
				System.out.print("No");
			}
				else
				{
					for (l = 0;l < i;l++)
					{
							  if (a[l] != a[l + 1])
							  {
								 System.out.printf("%d",a[l + 1]);
								 break;
							  }
					}

				}
		}

	/*	for (l=0;l<i;l++)
			printf("%d ",a[l]);*/
		return 0;
	}
}

