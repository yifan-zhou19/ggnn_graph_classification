package <missing>;

public class GlobalMembers
{
	public static int number(int a,int b)
	{
		int total;
		if (a == 1)
		{
		  total = 1;
		  return total;
		}
		if (b == 1)
		{
			total = 1;
			return total;
		}
		if (a < b)
		{
			total = number(a, a);
			return total;
		}
		if (a == b)
		{
			total = 1 + number(a, b - 1);
			return total;

		}
		if (a > b)
		{
			total = number(a - b, b) + number(a, b - 1);
			return total;
		}
	}
	public static void Main()
	{
		int[] m = new int[20];
		int[] n = new int[20];
		int[] C = new int[20];
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			C[i] = number(m[i], n[i]);
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",C[i]);
		}

	}
}

