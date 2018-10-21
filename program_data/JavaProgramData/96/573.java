package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] i_shu = new int[100];
		int[] shang = new int[100];
		int i;
		int len;
		int yu = 0;
		int k = 0;
		String c_shu = new String(new char[100]);
		c_shu = new Scanner(System.in).nextLine();
		len = c_shu.length();

		for (i = 0; i < len; i++)
		{
			i_shu[i] = c_shu.charAt(i) - '0';
		}

		for (i = 0; i < len; i++)
		{
			yu = yu * 10 + i_shu[i];
			shang[i] = yu / 13;
			yu = yu % 13;
		}

		if (len <= 2)
		{
			System.out.print(shang[1]);
		}
		else
		{
			for (i = 0; shang[i] == 0; i++)
			{
				k++;
			}
			for (i = k; i < len; i++)
			{
				System.out.print(shang[i]);
			}
		}
		System.out.print("\n");
		System.out.print(yu);
		System.out.print("\n");
		return 0;
	}
}
