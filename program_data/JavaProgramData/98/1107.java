package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		int n;
		int i1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i1 = 0;i1 < n;i1++)
		{
			*(a.Substring(i1)) = ConsoleInput.readToWhiteSpace(true);
		}
		int num = 0;
		for (int i2 = 0;i2 <= i1 - 1;i2++)
		{
			if (num + String.valueOf(*(a.Substring(i2))).length() <= 80 && num + String.valueOf(*(a.Substring(i2))).length() + 1 + String.valueOf(*(a.Substring(i2) + 1)).length() <= 80 && i2 != i1 - 1)
			{
				System.out.print((a.Substring(i2)));
				System.out.print(" ");
				num = num + String.valueOf(*(a.Substring(i2))).length() + 1;
			}
			else if (num + String.valueOf(*(a.Substring(i2))).length() <= 80 && num + String.valueOf(*(a.Substring(i2))).length() + 1 + String.valueOf(*(a.Substring(i2) + 1)).length()>80)
			{
				System.out.print((a.Substring(i2)));
				System.out.print("\n");
				num = 0;
			}
			else if (num + String.valueOf(*(a.Substring(i2))).length() <= 80 && num + String.valueOf(*(a.Substring(i2))).length() + 1 + String.valueOf(*(a.Substring(i2) + 1)).length() <= 80 && i2 == i1 - 1)
			{
				System.out.print((a.Substring(i2)));
			}
		}
	}
}

