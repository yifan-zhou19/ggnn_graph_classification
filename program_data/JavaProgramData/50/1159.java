package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int k;
		int[] p = new int[13];
		int i;
	w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		switch (w)
		{
			case 1:
				k = 5;
				break;
		case 2:
			k = 4;
			break;
			case 3:
				k = 3;
				break;
				case 4:
					k = 2;
					break;
					case 5:
						k = 1;
						break;
					case 6:
						k = 7;
						break;
					case 7:
						k = 6;
						break;
		}
		p[0] = 0;
		p[1] = 13;
		p[2] = 13 + 31;
		p[3] = 13 + 31 + 28;
		p[4] = 13 + 31 + 28 + 31;
		p[5] = 13 + 31 + 28 + 31 + 30;
		p[6] = 13 + 31 + 28 + 31 + 30 + 31;
		p[7] = 13 + 31 + 28 + 31 + 30 + 31 + 30;
		p[8] = 13 + 31 + 28 + 31 + 30 + 31 + 30 + 31;
		p[9] = 13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		p[10] = 13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		p[11] = 13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		p[12] = 13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		for (i = 1;i <= 12;i++)
		{
			if ((p[i] - k) % 7 == 0)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}





		return 0;
	}

}

