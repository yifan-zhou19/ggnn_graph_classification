package <missing>;

public class GlobalMembers
{
	//   @ ?????.cpp
	//   @ 1000012895
	//   @ ???
	//   @ 2010/11/17

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] inta = new int[100];
		int[] intb = new int[100];
		int i;
		int j;
		int counta;
		int countb;
		int count0;
		for (i = 1; i <= n; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (counta = 0; a.charAt(counta) != '\0'; counta++)
			{
				inta[counta] = a.charAt(counta) - '0';
			}
			for (countb = 0; b.charAt(countb) != '\0'; countb++)
			{
				intb[countb] = b.charAt(countb) - '0';
			}
			for (j = counta - 1; j >= counta - countb; j--)
			{
				inta[j] = inta[j] - intb[j - counta + countb];
				if (inta[j] < 0)
				{
					inta[j] += 10;
					inta[j - 1]--;
				}
			}
			for (count0 = 0; inta[count0] == 0; count0++)
			{
				;
			}
			for (j = count0; j < counta; j++)
			{
				System.out.print(inta[j]);
			}
			System.out.print("\n");
			System.in.read();
		}
		return 0;
	}


}

