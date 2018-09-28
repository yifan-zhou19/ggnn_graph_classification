package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int flag;
		String a = new String(new char[502]);
		char p;
		i = 1;
		while (cin.get(p) && p != '\n')
		{
		a = tangible.StringFunctions.changeCharacter(a, i, p);
		n = i;
		i++;
		} //????????
		for (i = 2;i <= n;i++) //????????????2?n
		{
			for (j = 1;j <= n + 1 - i;j++) //????????????i???j???j+i-1??
			{
				for (k = 0;k <= i - 1;k++)
				{
				if (a.charAt(j + k) == a.charAt(j + i - 1 - k)) //?????i????????
				{
					flag = 1;
				}
				else
				{
					flag = 0;
					break;
				}
				}
			if (flag == 1)
			{
				for (t = j;t <= j + i - 2;t++)
				{
				System.out.print(a.charAt(t));
				}
			System.out.print(a.charAt(j + i - 1));
			System.out.print("\n");
			} //???i?????
			}
		}
		return 0;
	}
}

