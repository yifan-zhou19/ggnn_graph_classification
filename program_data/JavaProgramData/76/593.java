package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int i;
		int j;
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
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
		}
		for (i = 0;i < n;i++)
		{
			 for (j = 0;j < n - i - 1;j++)
			 {
				 if (a[j] > a[j + 1])
				 {
				 int x = a[j];
				 a[j] = a[j + 1];
				 a[j + 1] = x;
				 x = b[j];
				 b[j] = b[j + 1];
				 b[j + 1] = x;
				 }
			 }
		}
		int sign = 1;
		for (i = 1;i < n;i++)
		{
			if (a[i] > b[i - 1])
			{
				sign = 0;
				break;
			}
			if (b[i - 1] > b[i])
			{
				b[i] = b[i - 1];
			}
		}
		if (sign == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",a[0],b[n - 1]);
		}
		return 0;
	}
}

