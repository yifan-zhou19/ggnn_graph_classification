package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[300]);
		int[] num = new int[26];
		int i;
		int j = 0;
		int len;
		int flag = 0;
		String = new Scanner(System.in).nextLine();
		len = String.length();
		for (j = 0;j < len;j++)
		{
			for (i = 0;i < 26;i++)
			{
			if (String[j] == i + 'a')
			{
				num[i]++;
				break;
			}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a',num[i]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}

}
