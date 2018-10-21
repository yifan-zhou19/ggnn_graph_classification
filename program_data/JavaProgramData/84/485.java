package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int length = 0;
		int[] a = new int[110];
		length = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < length; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int sec = 1;
		int point = 0;
		while (point + sec < length)
		{
			while (point + sec < length)
			{
				if (a[point] < a[point + sec])
				{
					int temp = a[point];
					a[point] = a[point + sec];
					a[point + sec] = temp;
				}
				point = point + sec * 2;
			}
			sec = sec * 2;
			point = 0;
		}
		System.out.print(a[0]);
		System.out.print("\n");
		sec = sec / 4;
		if (a[sec] > a[sec * 2])
		{
			System.out.print(a[sec]);
			System.out.print("\n");
		}
		else
		{
			System.out.print(a[sec * 2]);
			System.out.print("\n");
		}
		return 0;
	}
}

