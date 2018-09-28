package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i = 1;
		int max;
		int submax;
		char p;
		while (scanf("%d%c", a, p) && p != '\n')
		{
			if (i == 1)
			{
				max = a;
				submax = 0;
			}
			else
			{
				if (a > max)
				{
					submax = max;
					max = a;
				}
				else
				{
					if (a > submax && a != max)
					{
						submax = a;
					}
				}
			}
			i++;
		}
		if (i == 1) //?????
		{
			System.out.print("No");
		}
		else
		{
			if (a > max)
			{
				submax = max;
				max = a;
			}
			else
			{
				if (a > submax && a != max)
				{
					submax = a;
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
