package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n = 0;
		char c;
		int i;
		int j;
		int t;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			n++;
		}while (c != '\n');
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - i - 1;j++)
				{
					if (a[j] < a[j + 1])
					{
						t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
				}
			}
			if (a[n - 1] == a[0])
			{
				System.out.print("No");
			}
			else
			{
				for (i = 1;i < n;i++)
				{
					if (a[i] < a[i - 1])
					{
						System.out.printf("%d",a[i]);
						break;
					}
				}
			}
		}
	}

}

