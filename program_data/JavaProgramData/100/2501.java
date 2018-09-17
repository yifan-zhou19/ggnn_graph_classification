package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[301]);
		int len;
		int[] num = new int[52];
		int i;
		int flag = 0;

		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				num[s.charAt(i) - 65]++;
			}
			else if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{
				num[s.charAt(i) - 97 + 26]++;
			}
		}

		for (i = 0;i < 52;i++)
		{
			if (num[i] != 0)
			{
				flag = 1;
				if (i < 26)
				{
					System.out.printf("%c=%d\n",i + 65,num[i]);
				}
				else
				{
					System.out.printf("%c=%d\n",i - 26 + 97,num[i]);
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
	}

}
