package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] roadx = new int[15];
		int[] roady = new int[15];
		int c1 = 0;
		int c2 = 0;
		while (true)
		{
			 roadx[c1] = x;
			 x /= 2;
			 c1++;
			 if (x == 0)
			 {
				 break;
			 }
		}
		while (true)
		{
			 roady[c2] = y;
			 y /= 2;
			 c2++;
			 if (y == 0)
			 {
				 break;
			 }
		}
		int i = 0;
		while (true)
		{
			if (roadx[c1 - i - 1] != roady[c2 - i - 1])
			{
				System.out.print(roadx[c1 - i]);
				break;
			}
			if (i == c1 - 1)
			{
				System.out.print(roadx[0]);
				break;
			}
			if (i == c2 - 1)
			{
				System.out.print(roady[0]);
				break;
			}
			i++;
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

