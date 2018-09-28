package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		int n;
		int i = 0;
		int j = 0;
		int lena;
		int lenb;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			int[] p = new int[102];
			int[] q = new int[102];

			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			lena = a.length();
			lenb = b.length();
			for (j = 0; j < lena; j++)
			{
				 p[j] = a.charAt(lena - j - 1) - '0';
			}
			for (j = 0; j < lenb; j++)
			{
				 q[j] = b.charAt(lenb - j - 1) - '0';
			}
			for (j = 0; j <= lena; j++)
			{
				 if (p[j] < q[j])
				 {
				p[j + 1]--;
				p[j] = p[j] - q[j] + 10;
				 }
				else
				{
					p[j] -= q[j];
				}
			}
			int temp = 1;
			for (j = lena; j >= 0; j--)
			{

				if (p[j] == 0 && temp == 1)
				{
					continue;
				}
				if (p[j] != 0)
				{
					System.out.print(p[j]);
					temp = 0;
				}
				if (p[j] == 0)
				{
					System.out.print(p[j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

