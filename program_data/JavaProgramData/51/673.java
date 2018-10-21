package <missing>;

public class GlobalMembers
{
	// * * * * * * * * * * * * * *
	// *???????           *
	// *??????  1300013011 *
	// *???2013.12.13         *
	// * * * * * * * * * * * * * *
	public static int Main()
	{
		int i;
		int j;
		int l;
		int k;
		int n; // cnt???????????
		int[] a = new int[502];
		int cnt = 0;
		// ????gram?????????a?????????
		String ch = new String(new char[502]);
		char[][] gram =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		String p = ch;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; * (p.Substring(i) + n - 1) != '\0'; i++) // ???????????
		{
			for (j = 0; j < n; j++)
			{
				gram[cnt][j] = (p.Substring(i) + j); // ?????????????
			}
			a[cnt]++; // ????????1
			for (k = 0; k < cnt; k++) // ????????????
			{
				for (l = 0; l < n; l++)
				{
					if (gram[k][l] != gram[cnt][l]) // ???????
					{
						break;
					}
				}
				if (l == n) // ??????????????1??????
				{
					a[k]++;
					a[cnt]--;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
					memset(gram[cnt], 0, (Character.SIZE / Byte.SIZE));
				}
			}
			if (a[cnt] != 0) // ???????????????????????1
			{
				cnt++;
			}
		}
		int max = 0;
		for (i = 0; i < cnt; i++) // ??????????
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i < cnt; i++) // ???????????????
			{
				if (a[i] == max)
				{
					System.out.print(gram[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

