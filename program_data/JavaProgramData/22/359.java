package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int i = 0;
		int j;
		int s = 0;
		int a;
		int[] m = new int[300];
		int max1;
		int max2;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				m[i] = s;
				i++;
				s = 0;
			}
			else
			{
				a = c - '0';
				s = s * 10 + a;
			}

		}
		m[i] = s;
		if (i == 1)
		{
			System.out.print("No");
		}
			else
			{
				max1 = m[0];
				max2 = -1;
				for (j = 1;j <= i;j++)
				{
					if (m[j] > max1)
					{
						max2 = max1;
						max1 = m[j];
					}
					else if (m[j] == max1)
					{
						continue;
					}
					else if (m[j] > max2)
					{
						max2 = m[j];
					}
					//printf("%d,%d",max1,max2);printf("\n\n");
				}

			if (max1 == max2 || max2 == -1)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",max2);
			}
			}
	}
}
