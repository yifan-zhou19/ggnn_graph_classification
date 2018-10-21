package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
	int j;
	int s;
	int n;
	int i;
	int m;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	????,?????????????m,??m??????????????*/
	while (n > 0)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	s = 0;
	for (i = 0;i < 100;i++)
	{
		a[i] = 0;
	}
	if (m == 0)
	{
		s = 0;
	}
	else
	{
		for (i = 0;i < m;i++)
		{
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a[j + 1 + 3 * i] = 1;
	a[j + 2 + 3 * i] = 1;
	a[j + 3 + 3 * i] = 1;
		}
	for (i = 1;i <= 60;i++)
	{
		s = s + a[i];
	}
	}
	System.out.print(60 - s);
	System.out.print("\n");
	n--;
	}
	return 0;
	}
}

