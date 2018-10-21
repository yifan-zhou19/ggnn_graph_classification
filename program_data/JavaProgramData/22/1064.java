package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[305];
		int i = 1;
		int max;
		int submax;
		int j;
		char p;
		while (scanf("%d%c", a[i], p) && p != '\n')
		{
			i++;
		}
		if (i == 1) //?????
		{
			System.out.print("No");
		}
		else
		{
			max = a[1];
			submax = 0;
			for (j = 2;j <= i;j++)
			{
				if (a[j] > max)
				{
					submax = max;
					max = a[j];
				}
				else
				{
					if (a[j] > submax && a[j] != max)
					{
						submax = a[j];
					}
				}
			}
			if (submax == 0)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",submax);
			}
		}
	}
}
