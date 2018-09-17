package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int[] x1 = new int[100];
		int[] x2 = new int[100];
		int j;
		int m;
		int k;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		x1[0] = a;
		x2[0] = b;
		for (i = 1;;i++)
		{
			x1[i] = x1[i - 1] / 2;
			if (x1[i] == 0)
			{
			break;
			}
		}
		for (j = 1;;j++)
		{
			x2[j] = x2[j - 1] / 2;
			if (x2[j] == 0)
			{
			break;
			}
		}
		for (k = 0;k <= i;k++)
		{
			for (m = 0;m <= j;m++)
			{
				if (x1[k] == x2[m])
				{
					System.out.printf("%d",x1[k]);
					flag = 1;
					break;
				}

			}
		  if (flag == 1)
		  {
			  break;
		  }
		}

	}


}

