package <missing>;

public class GlobalMembers
{
	// ??????????????
	// ??
	// 1000012768
	// 2010.11.19
	public static int Main()
	{
		String a = new String(new char[100]); //???????????
		String b = new String(new char[100]);
		int[] anum = new int[100];
		int[] bnum = new int[100];
		int n;
		int i;
		int j;
		int k;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p = 0;
			int la = a.length(); //??????????????????
			int lb = b.length();
			for (j = la - 1; j >= 0; j--)
			{
				anum[p++] = a.charAt(j) - '0';
			}
			p = 0;
			for (j = lb - 1; j >= 0; j--)
			{
				bnum[p++] = b.charAt(j) - '0';
			}
			for (k = 0; k < lb; k++)
			{
				anum[k] = anum[k] - bnum[k]; //???????????0??????
				if (anum[k] < 0)
				{
					anum[k] += 10;
					anum[k + 1]--;
				}
			}
			for (k = la - 1; k >= 0; k--)
			{
				System.out.print(anum[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}





}

