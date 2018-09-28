package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int k = 0;
		int p = 0;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] x =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		}; //??????????????
		for (i = 0;i < n;i++)
		{
			*(x + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(*(x + i)).length();
			k = k + l; //k??????????
			if (i == 0)
			{
				System.out.print((x));
				continue;
			} //???????
			if (k != l && k + p + 1 <= 80)
			{
				System.out.print(" ");
				System.out.print((x + i));
				p++;
				continue;
			} //???????80???????p????????
			if (k + p + 1 > 80)
			{
				System.out.print("\n");
				System.out.print((x + i));
				k = String.valueOf(*(x + i)).length();
				p = 0;
				continue;
			} //????80????????????k?p??
		}
		return 0;
	}
}

