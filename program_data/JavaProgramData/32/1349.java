package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n - 1;i++)
		{
			String a = new String(new char[101]);
			String b = new String(new char[101]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int c = a.length();
			int d = b.length();
			int[] e = new int[100];
			int[] f = new int[100];
			int h = 0;
			int j = 0;
			for (int g = c - 1;g >= 0;g--)
			{
				e[h] = a.charAt(g) - '0';
				h++;
			} //????????
			for (int g = d - 1;g >= 0;g--)
			{
				f[j] = b.charAt(g) - '0';
				j++;
			}
			for (int g = d;g < 100;g++)
			{
				f[g] = 0; //?????????????????0
			}
			int[] l = new int[100];
			for (int k = 0;k <= c - 1;k++)
			{
				if (e[k] >= f[k])
				{
					l[k] = e[k] - f[k];
				}
				else
				{
					l[k] = e[k] + 10 - f[k];
					e[k + 1] = e[k + 1] - 1; //????????????????????????
				}
			}
			int t = 99;
			while (l[t] == 0) //?????????
			{
				t--;
			}
			for (;t >= 0;t--)
			{
				System.out.print(l[t]);
			}
			System.out.print("\n");
		}


		return 0;


	}

}

