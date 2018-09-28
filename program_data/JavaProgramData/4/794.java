package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] data = new int[row * col];
		for (int i = 0;i < row * col;++i)
		{
			data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] head = data;
		for (int i = 0;i < col;++i)
		{
			int[] p = head;
			for (int j = 0;j <= Math.min(i,row - 1);++j)
			{
				System.out.print(p);
				System.out.print("\n");
				p += col - 1;
			}
			++head;
		}
		--head;
		for (int i = 1;i < row;++i)
		{
			head += col;
			int[] p = head;
			for (int j = 0;j <= Math.min(col - 1,row - i - 1);++j)
			{
				  System.out.print(p);
				  System.out.print("\n");
				  p += col - 1;
			}
		}
		return 0;
	}

}

