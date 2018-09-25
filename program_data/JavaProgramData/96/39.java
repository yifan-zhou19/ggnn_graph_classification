package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int i;
		int s;
		int k;
		a = new Scanner(System.in).nextLine();
		int[] b = new int[100];
		int[] c = new int[100];
		int n = a.length();
		for (i = 0;i < n;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (n == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d\n",b[0]);
		}
		else if (n == 2)
		{
			if ((b[0] * 10 + b[1]) >= 13)
			{
				k = (b[0] * 10 + b[1]) / 13;
				s = b[0] * 10 + b[1] - 13 * k;
				System.out.printf("%d\n%d\n",k,s);
			}
			else
			{
				k = 0;
				s = b[0] * 10 + b[1];
				System.out.printf("%d\n%d\n",k,s);
			}
		}
		else if (n >= 3)
		{
		if (10 * b[0] + b[1] >= 13)
		{
			c[0] = (10 * b[0] + b[1]) / 13;
			s = 10 * b[0] + b[1] - 13 * c[0];
			System.out.printf("%d",c[0]);
			for (i = 1;i < n - 1;i++)
			{
				if ((s * 10 + b[i + 1]) < 13)
				{

						c[i] = 0;
						s = s * 10 + b[i + 1];
				}
				else
				{
					c[i] = (s * 10 + b[i + 1]) / 13;
					s = s * 10 + b[i + 1] - 13 * c[i];
				}

				System.out.printf("%d",c[i]);
			}
			System.out.print("\n");
		}
		else if (10 * b[0] + b[1] < 13)
		{
			c[0] = (100 * b[0] + b[1] * 10 + b[2]) / 13;
			s = 100 * b[0] + b[1] * 10 + b[2] - 13 * c[0];
			System.out.printf("%d",c[0]);
			for (i = 1;i < n - 2;i++)
			{
				if ((s * 10 + b[i + 2]) < 13)
				{
					c[i] = 0;
					s = s * 10 + b[i + 2];
				}
				else
				{
					c[i] = (s * 10 + b[i + 2]) / 13;
					s = s * 10 + b[i + 2] - 13 * c[i];
				}
				System.out.printf("%d",c[i]);
			}
			System.out.print("\n");
		}
		System.out.printf("%d\n",s);
		}
	}



}
