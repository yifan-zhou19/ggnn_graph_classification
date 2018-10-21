package <missing>;

public class GlobalMembers
{
	/*
	hw.cpp
	????yang?
	?????????????????????????????????????? 
	???10.28
	*/
	public static int Main()
	{
		int[] n = new int[100001];
		int k;
		int n1;
		int z = 0;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n1;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n1;i++)
		{
			if (n[i] != k)
			{ //????k?????
				z = z + 1; //??????????????
				if (z == 1)
				{
					System.out.print(n[i]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(n[i]);
				}
			}
		}
		return 0;
	}
}

