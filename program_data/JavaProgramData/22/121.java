package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int[] a = new int[300];
		int max;
		int c = -1;
		int b = -1;
		int n;
		char d;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			d = System.in.read();
			i++;
		}while (d == ',');
		n = i;
		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < max)
			{
				c = a[i];
			break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < max && a[i]> c)
			{
				c = a[i];
			b++;
			}
		}
		if (b == -1 && c == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",c);
		}
	}
}

