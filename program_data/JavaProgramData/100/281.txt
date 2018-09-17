package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		String num = new String(new char[26]);
		int i;
		int t;
		int flag = 0;
		for (i = 0;i < 26;i++)
		{
			num = num.substring(0, i);
		}
		str = new Scanner(System.in).nextLine();
		i = 0;
		while (str.charAt(i) != null)
		{
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
			{
				t = str.charAt(i) - 'a';
				num.charAt(t)++;
			}
			i++;
		}
		for (i = 0;i <= 25;i++)
		{
			if (num.charAt(i) != 0)
			{
				System.out.printf("%c=%d\n",i + 'a',num.charAt(i));
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
	}

}
