package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int flag;
		int[] count = new int[26];
		String a = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore();
		for (i = 1; i <= t; i++)
		{
			for (k = 0; k < 26; k++)
			{
				count[k] = 0;
			}
			flag = 0;
			for (j = 0; ; j++)
			{
				cin.get(a.charAt(j));
				if (a.charAt(j) == '\n')
				{
					break;
				}
				count[a.charAt(j) - 97]++;
			}
			for (k = 0; k < j ; k++)
			{
				if (count[a.charAt(k) - 97] == 1)
				{
					System.out.print(a.charAt(k));
					System.out.print("\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

