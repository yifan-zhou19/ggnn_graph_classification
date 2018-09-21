package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		char[][] d = new char[50][50];
		int i;
		int k = 0;
		int j = 0;
		int[] a = new int[100];
		int max;
		int min;
		int p;
		int q = 0;
		int t;
		int w = 1;
		s = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			d[k][q] = s.charAt(i);
			a[k]++;
			if ((s.charAt(i + 1) == ' '))
			{
				q++;
				d[k][q] = '\0';
				k++;
				q = 0;
				i = i + 1;
			}
			if ((s.charAt(i + 1) == '\0'))
			{
				q++;
				d[k][q] = '\0';
				k++;
				q = 0;
				break;
			}
			else
			{
				q++;
			}
		}
		max = a[0];
		min = a[0];
		for (i = 0;i < k;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = 0;i < k;i++)
		{
				if (a[i] == max)
				{
					w = 2;
					if (i == 0)
					{
						t = 0;
					}
					else
					{
						t = 1;
					}
					for (j = t;d[i][j] != '\0';j++)
					{
						System.out.printf("%c",d[i][j]);
					}
				}
			if (w == 2)
			{
				break;
			}
		}

		System.out.print("\n");
		for (i = 0;i < k;i++)
		{

			if (a[i] == min)
			{
				w = 0;
				if (i == 0)
				{
					t = 0;
				}
				else
				{
					t = 1;
				}
				for (j = t;d[i][j] != '\0';j++)
				{
					 System.out.printf("%c",d[i][j]);
				}
			}
			if (w == 0)
			{
				break;
			}
		}
	}
}
