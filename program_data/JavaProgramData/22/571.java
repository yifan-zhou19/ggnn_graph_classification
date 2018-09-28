package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int n;
		int[] a = new int[100];
		int temp;
		int k = 0;
		char b;
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
				b = tempVar2.charAt(0);
			}
			i = i + 1;
		} while (b == ',');
		n = i;
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
			}
		for (j = 0;j < n - 1;j++)
		{
			if (a[j] == a[j + 1])
			{
				k++;
			}
		}
			if (k == n - 1)
			{
				System.out.print("No");
			}
			else
			{
				for (i = 0;i < n;i++)
				{
				if (a[i] < a[0])
				{
					System.out.printf("%d",a[i]);
					break;
				}
				}
			}
		}
	}

}

