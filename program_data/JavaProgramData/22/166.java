package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int temp;
		int l = 0;
		int[] a = new int[300];
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[l] = Integer.parseInt(tempVar);
			}
			l++;
		}while (System.in.read() != '\n');
		if (l != 1)
		{
			for (i = 0;i < l;i++)
			{
				for (j = 0;j < l - i - 1;j++)
				{
					if (a[j] > a[j + 1])
					{
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
			if (a[0] == a[l - 1])
			{
				System.out.print("No");
			}
			for (i = l - 1;i >= 0;i--)
			{
				if (a[i] != a[l - 1])
				{
					System.out.printf("%d",a[i]);
					break;
				}
			}
		}
		else
		{
			System.out.print("No");
		}
	}

}

