package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] c = new int[100];
		int i;
		int j;
		int numb;
		int temp;
		int k;
		int f = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				numb = Integer.parseInt(tempVar);
			}
		for (i = 0;i < numb;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < numb;i++)
		{
			for (j = 0;j < numb - i - 1;j++)
			{
				if (c[j] > c[j + 1])
				{
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}
			}
		}
		for (k = 0;k < numb;k++)
		{
			if (f != 0 && c[k] % 2 != 0)
			{
				System.out.printf(",%d",c[k]);
			}
			if (f == 0 && c[k] % 2 != 0)
			{
				System.out.printf("%d",c[k]);
				f++;
			}

		}
		return 0;
	}
}

