package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
		char c;
		int[] a = new int[1001];
		int i = 1;
		int first = -1;
		int second = -1;
		for (i = 0;i <= 1000;i++)
		{
			a[i] = 1000;
		}
		i = 1;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ',')
			{
				if (a[i] == 1000)
				{
					a[i] = 0;
				}
				a[i] = a[i] * 10 + c - '0';
			}
			else
			{
				i++;
			}
		}
		if (a[2] == 1000)
		{
			System.out.print("No\n");
		}
		first = a[1];
		for (i = 2;a[i] != 1000;i++)
		{
			if (a[i] > first)
			{
				second = first;
				first = a[i];
			}
			else if (a[i] > second && a[i] != first)
			{
				second = a[i];
			}
		}
		if (second == -1 && a[2] != 1000)
		{
			System.out.print("No\n");
		}
		else if (a[2] != 1000)
		{
			System.out.printf("%d\n",second);
		}
	 }

}
