package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int adet = new int(int a,int b,int c);
		int bdet = new int(int a,int b,int c);
		int cdet = new int(int a,int b,int c);
		int A = 0;
		int B = 0;
		int C = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int af = 0;
		int bf = 0;
		int cf = 0;
		int[] num1 = {10, 10, 5, 5, 1, 1};
		int[] num2 = {5, 1, 10, 1, 10, 5};
		int[] num3 = {1, 5, 1, 10, 5, 10};
		int i = 0;

		for (i = 0;i < 6;i++)
		{
			A = num1[i];
			B = num2[i];
			C = num3[i];

		if (A > B && A > C)
		{
				af = 0;
			if (B > C)
			{
				bf = 1;
				cf = 2;
			}
			else
			{
				bf = 2;
				cf = 1;
			}
		}
		else if (A > B && A < C)
		{
			af = 1;
			bf = 2;
			cf = 0;
		}
		else if (A > C && A < B)
		{
			af = 1;
			bf = 0;
			cf = 2;
		}
		else if (A < B && A < C)
		{
			af = 2;
			if (B > C)
			{
				bf = 0;
				cf = 1;
			}
			else
			{
				bf = 1;
				cf = 0;
			}
		}

		a = adet(A, B, C);
		b = bdet(A, B, C);
		c = cdet(A, B, C);

		if (af == a && bf == b && cf == c)
		{
			switch (i)
			{
			case 0:
				System.out.print("CBA");
				System.out.print("\n");
				break;
			case 1:
				System.out.print("BCA");
				System.out.print("\n");
				break;
			case 2:
				System.out.print("CAB");
				System.out.print("\n");
				break;
			case 3:
				System.out.print("BAC");
				System.out.print("\n");
				break;
			case 4:
				System.out.print("ACB");
				System.out.print("\n");
				break;
			case 5:
				System.out.print("ABC");
				System.out.print("\n");
				break;
			}

		}
		}
		return 0;

	}
	public static int adet(int a,int b,int c)
	{
		int x = 0;
		if (b > a)
		{
			x = x + 1;
		}
		if (c == a)
		{
			x = x + 1;
		}
		return (x);

	}
	public static int bdet(int a,int b,int c)
	{
		int x = 0;
		if (a > b)
		{
			x = x + 1;
		}
		if (c < a)
		{
			x = x + 1;
		}
		return (x);
	}
	public static int cdet(int a,int b,int c)
	{
		int x = 0;
		if (c > b)
		{
			x = x + 1;
		}
		if (b > a)
		{
			x = x + 1;
		}
		return (x);
	}

}
