package <missing>;

public class GlobalMembers
{
	//????


	public static int Main()
	{
		int n;
		int flag = 0;
		int[] start = new int[2];
		int[] end = new int[2];
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //????????????????
		{
			for (int j = 0;j < n;j++)
			{
				int p;
				p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (p == 0 && flag == 0)
				{
					start[0] = i;
					start[1] = j;
					flag = 1;
				}
				if (p == 0 && flag == 1)
				{
					end[0] = i;
					end[1] = j;
				}
			}
		}
		s = (end[0] - start[0] - 1) * (end[1] - start[1] - 1); //????
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

