package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int[] num = new int[300];
		int j = 0;
		int x;
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		for (int i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ' && i != len - 1)
			{
				num[j]++;
			}
			else if (a.charAt(i) == ' ' && i != len - 1)
			{
				j++;
			}
			else if (i = len - 1)
			{
				x = j;
			}

		}
		for (j = 0;j < x;j++)
		{
			if (num[j] != 0)
			{
				System.out.printf("%d,",num[j]);
			}
		}
		System.out.printf("%d",num[x] + 1);
		return 0;
	}
}
