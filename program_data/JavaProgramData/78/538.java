package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int t = 0;
		int k = 0;
		int[] a = new int[6];
		int[] result = {100, 0, 0, 0, 0, 0};
		int temp;
		char[] name = {'0', 'z', 'q', 's', 'l'};
		char temp2;
		for (i = 1;i <= 5;i++)
		{
			a[1] = i;
			for (j = 1;j <= 5;j++)
			{
				if (j == i)
				{
					continue;
				}
				else
				{
					a[2] = j;
				}
				for (t = 1;t <= 5;t++)
				{
					if (t == j || t == i)
					{
						continue;
					}
					else
					{
						a[3] = t;
					}
					for (k = 1;k <= 5;k++)
					{
						if (k == i || k == j || k == t)
						{
							continue;
						}
						else
						{
							a[4] = k;
						}
						if (((a[1] + a[2]) == (a[3] + a[4])) && ((a[1] + a[4]) > (a[2] + a[3])) && (a[2] > (a[1] + a[3])))
						{
							result[1] = a[1];
							result[2] = a[2];
							result[3] = a[3];
							result[4] = a[4];
						}
					}
				}
			}
		}
		for (i = 1;i <= 4;i++)
		{
			for (j = 1;j <= 4 - i;j++)
			{
				if (result[j] < result[j + 1])
				{
					temp = result[j];
					result[j] = result[j + 1];
					result[j + 1] = temp;
					temp2 = name[j];
					name[j] = name[j + 1];
					name[j + 1] = temp2;
				}
			}
		}
		for (i = 1;i <= 4;i++)
		{
			System.out.print(name[i]);
			System.out.print(" ");
			System.out.print(result[i] * 10);
			System.out.print("\n");
		}
		return 0;
	}
}
