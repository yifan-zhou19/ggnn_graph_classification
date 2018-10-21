package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int k;
		int[] a = new int[300];
		int t;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i++;
		}while (c != '\n');
		for (j = 0;j < i - 1;j++)
		{
			for (k = 0;k < i - j - 1;k++)
			{
				if (a[k] <= a[k + 1])
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
		if (j >= i)
		{
			System.out.print("No");
		}
	}
}

