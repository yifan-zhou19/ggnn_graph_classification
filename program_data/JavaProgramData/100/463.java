package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		String st = new String(new char[300]);
		final String num = "abcdefghijklmnopqrstuvwxyz";
		int i;
		int n;
		int j;
		int[] sum = new int[30];
		int total1 = 0;
		int total2 = 0;
		st = new Scanner(System.in).nextLine();
		n = st.length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (st.charAt(i) == num.charAt(j))
				{
					sum[j]++;
				}
				total1 += sum[j];
			}
			total2 += total1;
		}
		if (total2 == 0)
		{
			System.out.print("No");
		}
		else
		{

		for (j = 0;j < 26;j++)
		{
			if (sum[j] != 0)
			{
		System.out.printf("%c",num.charAt(j));
		System.out.printf("=%d\n",sum[j]);
			}
		}
		}
		return 0;
	}
}
