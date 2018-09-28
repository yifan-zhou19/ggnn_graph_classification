package <missing>;

public class GlobalMembers
{
	public static void oushu(int a)
	{
		void qishu(int a);
		System.out.printf("%d/2=%d\n",a,a / 2);
		if (a / 2 == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
		if ((a / 2) % 2 == 0)
		{
			oushu(a / 2);
		}
		else if ((a / 2) % 2 != 0)
		{
			qishu(a / 2);
		}
		}
	}
	public static void qishu(int a)
	{
		void oushu(int a);
		System.out.printf("%d*3+1=%d\n",a,a * 3 + 1);
		if ((a * 3 + 1) == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			if ((a * 3 + 1) % 2 == 0)
			{
				oushu((a * 3 + 1));
			}
			else
			{
				qishu((a * 3 + 1));
			}
		}
	}
	public static void Main()
	{
		void oushu(int a);
		void qishu(int a);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{

		if (n % 2 == 0)
		{
			oushu(n);
		}
		else
		{
			qishu(n);
		}
		}
	}
}

