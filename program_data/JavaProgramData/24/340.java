package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String number = new String(new char[10000]);
		number = new Scanner(System.in).nextLine();
		char[][] danci = new char[100][100];
		int max;
		int min;
		int i;
		int j;
		int k = 0;
		int n = 0;
		String chang = new String(new char[100]);
		final String duan = "aaaaa";
		for (i = 0;i < number.length();i++)
		{
			   if (number.charAt(i) != ' ' && number.charAt(i) != 0)
			   {
				  danci[n][k] = number.charAt(i);
				  k += 1;
			   }
				else
				{
				   n += 1;
				   k = 0;
				}

		}
		max = 0;
		min = 10;
		for (i = 0;i <= n;i++)
		{
			if (String.valueOf(danci[i]).length() > max)
			{
				max = String.valueOf(danci[i]).length();
				chang = danci[i];
			}
			if (String.valueOf(danci[i]).length() < min)
			{
				min = String.valueOf(danci[i]).length();
				duan = danci[i];
			}
		}
		System.out.printf("%s\n%s",chang,duan);
	return 0;
	}
}
