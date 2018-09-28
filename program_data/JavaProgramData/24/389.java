package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[500]);
		char[][] a = new char[50][20];
		int[] b = new int[50];
		int i = 0;
		int t = 0;
		int j;
		int min = 20;
		int max = 0;
		int count = 0;
		c = new Scanner(System.in).nextLine();
		for (j = 0;j < 50;j++)
		{
			count = 0;
			for (i = t;i < 20 + t;i++)
			{
				if (c.charAt(i) == ' ' || c.charAt(i) == '\0')
				{
					t = i + 1;
					break;
				}
				else
				{
					a[j][count] = c.charAt(i);
					count++;
				}
			}
			b[j] = count;
			if (c.charAt(i) == '\0')
			{
				break;
			}
		}


		for (i = 0;i <= j;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
			if (b[i] < min)
			{
				min = b[i];
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (b[i] == max)
			{
				for (t = 0;t < b[i];t++)
				{
					System.out.printf("%c",a[i][t]);
				}
				System.out.print("\n");
				break;
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (b[i] == min)
			{
				for (t = 0;t < b[i];t++)
				{
					System.out.printf("%c",a[i][t]);
				}
				break;
			}
		}
	}

}
