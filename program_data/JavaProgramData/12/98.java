package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int temp;
		int n = 0;
		int i = 1;
		int j;
		int k;
		do
		{
			do
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					temp = Integer.parseInt(tempVar);
				}
				a[i] = temp;
				i++;
				//	printf("%d ",a[i-1]);
			}while (temp != 0 && temp != -1);
				//printf("china");

			for (j = 1;j < i - 2;j++)
			{
				for (k = j + 1;k <= i - 2;k++)
				{
					if ((a[j] / a[k] == 2 && a[j] % a[k] == 0) || (a[k] / a[j] == 2 && a[k] % a[j] == 0))
					{
						n++;
						//printf("6");
					}
				}
			}
			if (temp != -1)
			{
				System.out.printf("%d\n",n);
			}
			i = 1;
			n = 0;
		}while (temp != -1);
		return 0;
	}

}

