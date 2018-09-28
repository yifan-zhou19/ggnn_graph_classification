package <missing>;

public class GlobalMembers
{
	/***************************************
	 *
	 *  ???????????????
	 *  ???1100017637 ???
	 *  ???2011.11.7
	 *
	 ***************************************/



	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int s;
		int l;
		int flag = 0;
		String a = new String(new char[100000]);

		// ???????????
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			// ?????
			s = 0;
			k = 0;
			j = 0, l = 0;
			flag = 0;

			// ????b[]?26????c[]???????????
			int[] c = new int[26];
			char[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '\0'};

			// ?????
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);

			// ????????a[]???b[]??????
			// ??c[]????????
			for (k = 0; a.charAt(k) != '\0' ; k++)
			{
				for (s = 0; s < 27; s++)
				{
					if (a.charAt(k) == b[s])
					{
						c[s]++;
					}
				}
			}

			// ????c[],?c[]??1???0??b[]
			for (j = 0; j < 27; j++)
			{
				if (c[j] != 1)
				{
					b[j] = 0;
				}
			}

			// ???a[]?b[],?a[]b[]?????????a[]
			for (l = 0; a.charAt(l) != '\0'; l++)
			{
				for (j = 0; j < 27; j++)
				{
					if (flag == 0)
					{
						if (a.charAt(l) == b[j])
						{
							System.out.print(a.charAt(l));
							System.out.print("\n");
							flag = 1;
							break;
						}
					}
				}
			}

			// ?????????no
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}

		return 0;
	}
}

