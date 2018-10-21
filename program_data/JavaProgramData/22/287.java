package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 0;
		int j;
		int k;
		int temp;
		char b;
		for (j = 0;j < 300;j++)
		{
			a[j] = 0;
		}
		do
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				b = tempVar.charAt(0);
			}
			if ((b >= '0' && b <= '9'))
			{
				a[i] = a[i] * 10 + b - '0';
			}
			else
			{
				i++;
			}
		}while (b != '\n');
		for (j = 0;j < i;j++)
		{
			for (k = 0;k < i - j;k++)
			{
				if (a[k] < a[k + 1])
				{
					temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
				if (a[0] == a[i - 1] || i == 1)
				{
					System.out.print("No");
				}
				else
				{
					for (k = 0;k <= i;k++)
					{
						if (a[k] < a[0])
						{
							System.out.printf("%d",a[k]);
							break;
						}
					}
				}
	}
}

