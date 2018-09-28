package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????13                       **
	//*?????? 1100012927              **
	//*???2011.11.3                     **
	//****************************************
	public static int Main()
	{
		String a = new String(new char[100]);
		int i = 0;
		int r;
		int j = 0;
		int[] b = new int[100];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (r = 0; a.charAt(r) != 0; r++)
		{
			b[r] = (i * 10 + a.charAt(r) - '0') / 13; //????????
			i = ((i * 10) + a.charAt(r) - '0') % 13; //???
		}

		if (r == 1 || (r == 2 && b[1] == 0))
		{
			System.out.print(b[0]);
		}
		else
		{
			while (b[j] == 0)
			{
				j++; //???0??????
			}
			for (; j < r; j++)
			{
				System.out.print(b[j]);
			}
		}
		System.out.print("\n");
		System.out.print(i);
		System.out.print("\n");
		return 0;
	}
}

