package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		final String st = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int[] stn = new int[52];
		int i;
		int j;
		int lenth;
		int flag = 0;
		lenth = a.length();
		for (i = 0;i < lenth;i++)
		{
			for (j = 0;j < 52;j++)
			{
				if (a.charAt(i) == st.charAt(j))
				{
				stn[j]++;
				flag = 1;
				break;
				}
			}
		}
		for (j = 0;j < 52;j++)
		{
			if (stn[j] != 0)
			{
				System.out.printf("%c=%d\n",st.charAt(j),stn[j]);
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}
