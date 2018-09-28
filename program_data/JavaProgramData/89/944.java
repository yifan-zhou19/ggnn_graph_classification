package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[99999];
		int[] b = new int[99999];
		int[] p = a;
		int[] q = b;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		int i;
		int j;
		for (k = 0; k < n; k++,p++)
		{
			p[0] = -1;
		}

		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{

			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			a[i] = j; //a?i????
			b[j]++; //b???j???
		}
		p = a;
		for (k = 0; k < n; k++, p++, q++)
		{
			if (q[0] == n - 1 && p[0] == -1)
			{
				System.out.print(k);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}


}

