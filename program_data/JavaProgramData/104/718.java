package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int x;
		int y;
		int i;
		int j;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = x;
		b[0] = y;
		for (i = 0;a[i] != 1;i++)
		{
			if (a[i] % 2 == 0)
			{
				a[i + 1] = a[i] / 2;
			}
			else
			{
				a[i + 1] = (a[i] - 1) / 2;
			}
		}
		for (i = 0;b[i] != 1;i++)
		{
			if (b[i] % 2 == 0)
			{
				b[i + 1] = b[i] / 2;
			}
			else
			{
				b[i + 1] = (b[i] - 1) / 2;
			}
		}
		for (i = 0;a[i] != 1;i++)
		{
			for (j = 0;b[j] != 1;j++)
			{
				if (a[i] == b[j])
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto lable;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	lable:
	System.out.print(a[i]);
	System.out.print("\n");
		return 0;
	}
}

