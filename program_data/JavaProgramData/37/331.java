import java.util.*;

package <missing>;

public class GlobalMembers
{
	//************************************
	//* ????1000012865_2             *
	//* ??????                     *
	//* ???2010-11-17                 *
	//* ???????????????   *
	//************************************
	public static int Main()
	{
		String letters = new String(new char[100001]);
		int i;
		int j;
		int t;
		int l;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (l = 1; l <= t; l++)
		{
			int[] k = new int[100001]; // ????????????
			int longs = 0;
			letters = new Scanner(System.in).nextLine(); // ?????
			longs = letters.length(); // ????
			for (i = 0; i < longs; i++)
			{
				if (k[i] == 0) // ?????????????
				{
					for (j = i + 1; j < longs; j++) // ??????????
					{
						if (k[j] == 0)
						{
							if (letters.charAt(i) == letters.charAt(j))
							{
								k[i]++;
								k[j]++;
							}
						}
					}
					if ((j == longs) && (k[i] == 0)) // ???????????????????
					{
						System.out.print(letters.charAt(i));
						System.out.print("\n");
						break;
					}
				}
			}
			if (i == longs && k[i - 1] != 0) // ????????????????�no�
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

