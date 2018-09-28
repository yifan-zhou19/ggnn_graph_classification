package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[5];
		int i;
		int j;
		int c;
		int max;
		int max2;
		int k = 1;
		int l;
		for (i = 0;i <= 300;i++)
		{
			j = 0;
			while ((c = System.in.read()) != ',')
			{
				if (c == '\n')
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				   goto here;
				}
				j = j * 10 + c - 48;
				a[i] = j;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	here:
		l = i;
		for (i = 1;i <= l;i++)
		{
			if (a[i] != a[i - 1])
			{
				k = 0;
			}
		}
		if (k == 1)
		{
			System.out.print("No");
		}
		else if (a[1] == 0)
		{
			System.out.print("No");
		}
		else
		{
			max = a[0];
			for (i = 1;i <= l;i++)
			{
				if (a[i] > max)
				{
					max = a[i];
				}
			}
			max2 = 0;
			for (i = 0;i <= l;i++)
			{
				if (a[i] == max)
				{
					continue;
				}
				else if (a[i] > max2)
				{
					max2 = a[i];
				}
			}
			System.out.printf("%d",max2);
		}
		return 0;
	}
}
