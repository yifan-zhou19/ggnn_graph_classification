package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int wz; //?????????weight
		int wq;
		int ws;
		int wl;
		int i; //??????????i?j
		int j;
		String a = new String(new char[5]);
		int[] b = new int[5]; //????a?b?a???????b??????
		int p; //???????????p??????????t
		int t;
		for (wz = 10;wz <= 50;wz = wz + 10)
		{
			for (wq = 10;wq <= 50;wq = wq + 10)
			{
				for (ws = 10;ws <= 50;ws = ws + 10)
				{
					for (wl = 10;wl <= 50;wl = wl + 10) //???????10?50??
					{
						if (wz + wq == ws + wl && wz + wl > ws + wq && wz + ws < wq)
					//??????????????????????????
					//??????????????????????
					//???????????????????
						{
						a = tangible.StringFunctions.changeCharacter(a, 1, 'z');
						a = tangible.StringFunctions.changeCharacter(a, 2, 'q');
						a = tangible.StringFunctions.changeCharacter(a, 3, 's');
						a = tangible.StringFunctions.changeCharacter(a, 4, 'l');
					 b[1] = wz;
					 b[2] = wq;
					 b[3] = ws;
					 b[4] = wl;
						}
					}
				}
			}
		}
		for (j = 1;j <= 3;j++)
		{
			for (i = 1;i <= 4 - j;i++)
			{
				if (b[i] < b[i + 1])
				{
					p = a.charAt(i);
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
					a = tangible.StringFunctions.changeCharacter(a, i + 1, p);
				 t = b[i];
				 b[i] = b[i + 1];
				 b[i + 1] = t;
				}
			}
		}
		for (i = 1;i <= 4;i++)
		{
			System.out.print(a.charAt(i));
			System.out.print(" ");
			System.out.print(b[i]);
			System.out.print("\n");
		} //????
	return 0;
	}
}

