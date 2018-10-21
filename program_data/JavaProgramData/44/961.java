package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int copy = int m;
		int[] a = new int[6];
		int b;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		b = copy(a[i]);
		System.out.printf("%d\n",b);
		}
	}
	public static int copy(int m)
	{
		int a;
		int b;
		int c;

				a = m;
			b = a % 10;

			do
			{
			  a = a / 10;
			  c = a % 10;
			  b = b * 10 + c;
			} while (a / 10 != 0);
			return b;



	}

}

