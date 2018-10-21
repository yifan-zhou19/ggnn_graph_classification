package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int i;
		int k = 0;
		int j = 0;
		int t;
		int sum = 0;
		int e = 0;
		int max = 0;
		int[] x = new int[1100];
		int[] y = new int[1100];
		int[] z = new int[1100];
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ('0' <= a.charAt(i) && a.charAt(i) <= '9')
			{
				t = a.charAt(i) - '0';
				sum = sum * 10 + t;
			}
			else
			{
				x[e] = sum;
				e++;
				sum = 0;
			}
		}
		x[e] = sum;
		sum = 0;
		e = 0;
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if ('0' <= b.charAt(i) && b.charAt(i) <= '9')
			{
				t = b.charAt(i) - '0';
				sum = sum * 10 + t;
			}
			else
			{
				y[e] = sum;
				e++;
				sum = 0;
			}
		}
		y[e] = sum;
		e++;
		sum = 0;
		for (i = 0;i <= 1000;i++)
		{
			sum = 0;
			for (j = 0;j < e;j++)
			{
				if (x[j] <= i != 0 && i < y[j])
				{
					sum++;
				}
			}
			z[i] = sum;
		}
		for (i = 0;i <= 1000;i++)
		{
			if (max < z[i])
			{
				max = z[i];
			}
		}
		System.out.printf("%d %d",e,max);


	}









}
