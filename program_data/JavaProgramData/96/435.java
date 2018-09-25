package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???chuyi13                           **
	//*????? 1100013004              **
	//*???2011.11.8                   **
	//****************************************
	public static int Main()
	{
		String yu = new String(new char[500]);
		int j = 0;
		int r = 0;
		int i = 0;
		int[] chu = new int[500];
		yu = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (r = 0; yu.charAt(r) != 0; r++)
		{
			chu[r] = (i * 10 + yu.charAt(r) - '0') / 13;
			 i = ((i * 10) + yu.charAt(r) - '0') % 13;
		}

		if (r == 1)
		{
			System.out.print(chu[0]);
			System.out.print("\n");
			System.out.print(i);
			System.out.print("\n");
		}
		else if (r == 2 && chu[1] == 0)
		{
			System.out.print(chu[0]);
			System.out.print("\n");
			System.out.print(i);
			System.out.print("\n");
		}
		else
		{
		while (chu[j] == 0 && j <= 1)
		{
			j++;
		}
		for (; j < r; j++)
		{
			System.out.print(chu[j]);
		}
			System.out.print("\n");
			System.out.print(i);
			System.out.print("\n");
		}
		return 0;
	}
}

