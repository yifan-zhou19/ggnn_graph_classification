package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int j;
		int t;
		int[] a = new int[300];
		int p = 1;
		char c;
		for (i = 0;i < 300;i++)
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
			if (c != ',')
			{
				break;
			}
		}
		for (k = i + 1;k < 300;k++)
		{
			a[k] = 0;
		}
		for (k = 0;k < i;k++)
		{
			for (j = 0;j < i - k;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
			for (j = i;j > 0;j--)
			{
				if (a[j - 1] < a[j])
				{
					System.out.printf("%d",a[j - 1]);
					p = 0;
					break;
				}
			}
				if (p != 0)
				{
					System.out.print("No");
				}
	}




}

