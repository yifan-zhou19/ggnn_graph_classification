package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int z1;
		int q1;
		int s1;
		int l1;
		char Z = 'z';
		char Q = 'q';
		char S = 's';
		char L = 'l';
		int max1;
		int max2;
		int min1;
		int min2;
		int n1;
		int n2;
		int n3;
		int n4;
		char MAX1;
		char MAX2;
		char MIN1;
		char MIN2;
		char N1;
		char N2;
		char N3;
		char N4;

		for (z1 = 10; z1 <= 50; z1 = z1 + 10)
		{
			for (q1 = 10; q1 <= 50; q1 = q1 + 10)
			{
				for (s1 = 10; s1 <= 50; s1 = s1 + 10)
				{
					for (l1 = 10; l1 <= 50; l1 = l1 + 10)
					{
						if ((z1 + q1 == s1 + l1) && (z1 + l1 >= s1 + q1) && (z1 + s1 < q1) && (z1 != q1) && (z1 != s1) && (z1 != l1) && (q1 != s1) && (q1 != l1) && (s1 != l1))
						{
							z = z1;
							q = q1;
							s = s1;
							l = l1;
						}
					}
				}
			}
		}

		if (z > q)
		{
			max1 = z;
			MAX1 = 'z';
			min1 = q;
			MIN1 = 'q';
		}
		else
		{
			max1 = q;
			MAX1 = 'q';
			min1 = z;
			MIN1 = 'z';
		}
		if (s > l)
		{
			max2 = s;
			MAX2 = 's';
			min2 = l;
			MIN2 = 'l';
		}
		else
		{
			max2 = l;
			MAX2 = 'l';
			min2 = s;
			MIN2 = 's';
		}

		if (max1 > max2)
		{
			n1 = max1;
			N1 = MAX1;
			n2 = max2;
			N2 = MAX2;
		}
		else
		{
			n1 = max2;
			N1 = MAX2;
			n2 = max1;
			N2 = MAX1;
		}
		if (min1 < min2)
		{
			n4 = min1;
			N4 = MIN1;
			n3 = min2;
			N3 = MIN2;
		}
		else
		{
			n4 = min2;
			N4 = MIN2;
			n3 = min1;
			N3 = MIN1;
		}
		System.out.print(N1);
		System.out.print(" ");
		System.out.print(n1);
		System.out.print("\n");
		System.out.print(N2);
		System.out.print(" ");
		System.out.print(n2);
		System.out.print("\n");
		System.out.print(N3);
		System.out.print(" ");
		System.out.print(n3);
		System.out.print("\n");
		System.out.print(N4);
		System.out.print(" ");
		System.out.print(n4);
		System.out.print("\n");
		return 0;
	}
}
