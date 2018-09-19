package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[120]);
		char[] a_cout = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char b;
		int[] num = new int[120];
		int i;
		int j;
		int k;
		while (cin.get(a.charAt(0)))
		{
			num[0] = 0;
			for (i = 1; i < 120; i++)
			{
				a = a.substring(0, i);
				num[i] = 0;
			}
		for (i = 0; ; i++)
		{
			if (i != 0)
			{
				cin.get(a.charAt(i));
			}
			if (a.charAt(i) == '\n')
			{
				break;
			}
			else
			{
				if (a.charAt(i) == '(')
				{
					num[i] = 1;
				}
				if (a.charAt(i) == ')')
				{
					num[i] = 2;
				}
			}
		}
		for (j = 0; j < i; j++)
		{
			if (a.charAt(j) == ')')
			{
				for (k = j - 1; k >= 0; k--)
				{
					if (a.charAt(k) == '(' && num[k] != 0)
					{
						num[k] = 0;
						num[j] = 0;
						break;
					}
				}
			}
		}
		for (j = 0; j < i; j++)
		{
			System.out.print(a.charAt(j));
		}
		System.out.print("\n");
		for (j = 0; j < i; j++)
		{
			if (num[j] == 0)
			{
				System.out.print(" ");
			}
			if (num[j] == 1)
			{
				System.out.print("$");
			}
			if (num[j] == 2)
			{
				System.out.print("?");
			}
		}
		System.out.print("\n");
		}
		return 0;
	}









}
