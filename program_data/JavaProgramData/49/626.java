package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int k = a.length();
		int[] b = new int[100];
		int[] c = new int[500]; //?????????????????????????
		int n1 = 0;
		int n2 = 0;
		for (int l = 2;l <= k;l = l + 2)
		{
			for (int i = 0;i < k - l + 1;i++)
			{
				int time = 1;
				for (int j = 0;j <= (l - 2) / 2;j++)
				{
					if (a.charAt(i + j) != a.charAt(i + l - 1 - j))
					{
						time = 0;
						break;
					}
				}
				if (time == 1)
				{
				  b[n1] = i; //???????????????????????????
				  n1++;
				  c[n2] = l;
				  n2++;

				}
			}
		}
		for (int i = 0;i < n1;i++) //??????????
		{
			for (int j = 0;j < c[i];j++)
			{
				System.out.print(a.charAt(b[i] + j));
			}
			System.out.print("\n");
		}

		return 0;

	}
}

