package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int[] x = new int[100];
		int[] y = new int[100];
		int i;
		int j;
		int k;
		int q;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		q = System.in.read();
		for (i = 0;;i++)
		{
			x[i] = System.in.read();
		if (x[i] == ' ')
		{
			break;
		}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < i;j++)
		{
			if (x[j] >= 48 && x[j] <= 57)
			{
			x[j] = x[j] - 48;
			}
		 if (x[j] >= 65 && x[j] <= 90)
		 {
			x[j] = x[j] - 55;
		 }
		 if (x[j] >= 97 && x[j] <= 122)
		 {
			x[j] = x[j] - 87;
		 }
		}
		for (j = 0;j < i;j++)
		{
			n = a * n + x[j];
		}
		if (n == 0)
		{
			System.out.print("0");
		}
		for (j = 0;n != 0;j++)
		{
			y[j] = n % b;
		n = n / b;
		if (y[j] >= 10)
		{
			y[j] = y[j] + 55;
		}
		else
		{
			y[j] = y[j] + 48;
		}
		}
		for (k = j - 1;k >= 0;k--)
		{
			System.out.print(y[k]);
		}
		System.out.print("\n");
	}

}

