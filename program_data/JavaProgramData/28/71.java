package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[8000]);
		str = new Scanner(System.in).nextLine();
		int l = str.length();
		int i;
		int num = 0;
		int[] len = new int[800];
		int word;
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) == ' ')
			{
				word = 0;
			}
			else
			{
				word = 1;
			}
			if (word == 1)
			{
				len[num] = len[num] + 1;
			}
			else if (word == 0 && i > 0 && str.charAt(i - 1) != ' ')
			{
				num = num + 1;
			}
		}
		System.out.printf("%d",len[0]);
		int j = 1;
		while (len[j] != 0)
		{
			System.out.printf(",%d",len[j]);
			j = j + 1;
		}
	}
}
