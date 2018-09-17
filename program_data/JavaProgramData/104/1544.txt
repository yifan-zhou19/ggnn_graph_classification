package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xpath = new int[100];
		int[] ypath = new int[100];
		int xi = 0;
		int yi = 0;
		xpath[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ypath[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (xpath[xi] != 1)
		{
			  xpath[xi + 1] = xpath[xi] / 2;
			  xi++;
		}
		while (ypath[yi] != 1)
		{
			  ypath[yi + 1] = ypath[yi] / 2;
			  yi++;
		}
	while (xi >= 0 && yi >= 0)
	{
		if (xpath[xi] != ypath[yi])
		{
			System.out.print(xpath[xi + 1]);
			System.out.print("\n");
			return 0;
		}
		xi--;
		yi--;
	}
	System.out.print((xi < 0?xpath[0]:ypath[0]));
	System.out.print("\n");
	return 0;
	}

}

