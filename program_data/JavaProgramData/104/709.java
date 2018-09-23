package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int t;
		int j;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[100];
	int[] b = new int[100];
	t = x;
	a[0] = x;
	for (i = 1;t / 2 > 0;i++)
	{
			a[i] = t / 2;
			t = t / 2;
	}
		 a[i] = 1;
		 t = y;
		 b[0] = y;
	for (j = 1;t / 2 > 0;j++)
	{
			b[j] = t / 2;
			t = t / 2;
	}
		 b[j] = 1;
	for (;;)
	{
		if (i == -1)
		{
			System.out.print(a[0]);
			break;
		}
	 if (j == -1)
	 {
			 System.out.print(b[0]);
			 break;
	 }
	if (a[i] != b[j])
	{
		System.out.print(a[i + 1]);
		System.out.print("\n");
		break;
	}
	else
	{
		i--;
		j--;
	}
	}
		return 0;
	}
}

