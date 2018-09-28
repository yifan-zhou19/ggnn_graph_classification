package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int wz = 0;
		int wq = 0;
		int ws = 0;
		int wl = 0;
		int a = 0;
		int i = 0;
		char[] b = {'0', '\0', '\0', '\0', '\0', '\0'};
		for (wz = 1;wz <= 5;wz = wz + 1)
		{
			for (wq = 1;wq <= 5;wq = wq + 1)
			{
				if (wq == wz)
				{
					continue;
				}
				for (ws = 1;ws <= 5;ws = ws + 1)
				{
					if (ws == wz || ws == wq)
					{
						continue;
					}
					for (wl = 1;wl <= 5;wl = wl + 1)
					{
						if (wl == wz || wl == wq || wl == ws)
						{
							continue;
						}
						a = (wz + wq == ws + wl) + (wz + wl > ws + wq) + (wz + ws < wq);
						if (a == 3)
						{
							b[wz] = 'z';
							b[wq] = 'q';
							b[ws] = 's';
							b[wl] = 'l';
						}

					}
				}
			}
		}
		for (i = 5;i > 0;i--)
		{
			if (b[i] == 0)
			{
			   continue;
			}
			System.out.print(b[i]);
			System.out.print(" ");
			System.out.print(i * 10);
			System.out.print("\n");
		}
		return 0;
	}



}
