package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int x;
		int y;
		int i = 0;
		int j = 0;
		int n1;
		int n2;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x >= 1)
		{
			a[i] = x;
			x = x / 2;
			i = i + 1;
		}
		n1 = i;
		while (y >= 1)
		{
			b[j] = y;
			y = y / 2;
			j = j + 1;
		}
		n2 = j;
		for (i = 0;i < n1;i++)
		{
			for (j = 0;j < n2;j++)
			{
				if (a[i] == b[j])
				{
					System.out.print(a[i]);
					System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	return 0;
	}

}

