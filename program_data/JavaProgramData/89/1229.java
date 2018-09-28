package <missing>;

public class GlobalMembers
{
		public static int[] a = new int[1000005];
		public static int[] b = new int[1000005];
		public static int va;
		public static int vb;
	public static int Main()
	{
		int n;
		int time = 0;
		int much;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		va = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		vb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((va != 0) || (vb != 0))
		{
			a[time] = va;
			b[time] = vb;
			time++;
			va = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			vb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		a[time] = va;
		b[time] = vb;
		for (int i = 0;i < n;i++)
		{
			much = 0;
			for (int j = 0;j <= time;j++)
			{
				if (b[j] == i)
				{
				much++;
				}
			}
			if (much >= n - 1)
			{
				flag = 1;
				for (int j = 0;j <= time;j++)
				{
					if ((a[j] == i) && (b[j] != i))
					{
							flag = 0;
							break;
					}
				}
				if (flag == 1)
				{
					System.out.print(i);
					System.out.print("\n");
					break;
				}
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

