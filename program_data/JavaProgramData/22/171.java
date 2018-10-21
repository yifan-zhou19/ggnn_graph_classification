package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int[] a = new int[300];
		int i;
		int max1 = 0;
		int max2 = 0;
		int num = 0;
		int same = 1;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				num = 0;
			}
			else if (num == 1 && c != ',')
			{
				a[n] = a[n] * 10 + c - '0';
			}
			else if (num == 0)
			{
				a[++n] = c - '0';
				num = 1;
			}

		}

		if (n == 1)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] != a[i + 1])
			{
				same = 0;
			}
		}

		if (same != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}

		for (i = 1;i <= n;i++)
		{
			if (a[i] > max1)
			{
				max1 = a[i];
			}
		}

		for (i = 1;i <= n;i++)
		{
			if (a[i] < max1 && a[i]> max2)
			{
				max2 = a[i];
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	if (same != 0)
	{
		System.out.print("No\n");
	}
		else
		{
			System.out.printf("%d\n",max2);
		}
	}
}
