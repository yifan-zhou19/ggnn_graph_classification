package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int k;
		int j;
		int i = 0;
		int t;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		i++;
		}while (System.in.read() != '\n');
		for (j = 0;j < i - 1;j++)
		{
			for (k = 0;k < i - 1 - j;k++)
			{
			if (a[k] < a[k + 1])
			{
				t = a[k];
			 a[k] = a[k + 1];
			 a[k + 1] = t;
			}
			}
		}
		for (j = 1;j < i;j++)
		{
		   if (a[j] < a[0])
		   {
			   System.out.printf("%d",a[j]);
		   break;
		   }
		}
		if (j == i)
		{
			System.out.print("No");
		}
	}
}

