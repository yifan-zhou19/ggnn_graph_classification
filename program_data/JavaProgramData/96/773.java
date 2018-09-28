package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[200]);
		int[] zs = new int[200];
		int[] shang = new int[200];
		int i;
		int j;
		int yu = 0;
		int flag = 0;
		c = new Scanner(System.in).nextLine();
		for (i = c.length() - 1;i >= 0;i--)
		{
			zs[i] = c.charAt(i) - '0';
		}
		for (i = 0;i < c.length();i++)
		{
			shang[i] = (yu * 10 + zs[i]) / 13;
			yu = (yu * 10 + zs[i]) % 13;
		}
		for (i = 0;i < c.length();i++)
		{
			if (flag != 0)
			{
				System.out.printf("%d",shang[i]);
			}
			if (1 - flag != 0)
			{
				if (shang[i] != 0)
				{
					System.out.printf("%d",shang[i]);
					flag = 1;
				}
			}
		}
			 if (flag == 0)
			 {
			System.out.print("0");
			 }
		System.out.print("\n");
		System.out.printf("%d",yu);
		return 0;
	}
}
