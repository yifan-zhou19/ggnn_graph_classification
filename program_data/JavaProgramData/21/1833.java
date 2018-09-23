package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		float sum = 0F;
		float ave;
		float temp;
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
		}
	for (i = 0;i < n;i++)
	{
			for (j = 0;j < (n - i);j++)
			{
				if (a[j] > a[j + 1])
				{
				temp = a[j];
			a[j] = a[j + 1];
			a[j + 1] = temp;
				}
			}
	}
	for (i = 1;i <= n;i++)
	{
			sum = sum + (float)a[i];
	}
		 ave = sum / ((float)n);
		 if ((ave - (float)a[1]) > ((float)a[n] - ave))
		 {
			 System.out.printf("%d",a[1]);
		 }
		 else if ((ave - (float)a[1]) < ((float)a[n] - ave))
		 {
			 System.out.printf("%d",a[n]);
		 }
		 else if ((ave - (float)a[1]) == ((float)a[n] - ave))
		 {
			 System.out.printf("%d,%d",a[1],a[n]);
		 }
		 System.out.print("\n");
	}

}

