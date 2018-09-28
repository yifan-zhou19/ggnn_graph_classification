package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fd;
		int[] m = {0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		int i;
		fd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 12;i++)
		{
			if ((fd + (m[i] + 5) % 7) % 7 == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
			fd += m[i];
		}
		return 0;
	}

}

