package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ls;
		int lo;
		int lr;
		int i;
		int j;
		int k;
		int flag;
		String str = new String(new char[257]);
		String org = new String(new char[257]);
		String rep = new String(new char[257]);
		str = new Scanner(System.in).nextLine();
		org = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		ls = str.length();
		lo = org.length();
		lr = rep.length();
		for (i = 0;i <= ls - lo;i++)
		{
			flag = 1;
			for (j = 0;j < lo;j++)
			{
				if (str.charAt(i + j) != org.charAt(j))
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				for (k = 0;k < i;k++)
				{
					System.out.printf("%c",str.charAt(k));
				}
				for (k = 0;k < lr;k++)
				{
					System.out.printf("%c",rep.charAt(k));
				}
				for (k = i + lo;k < ls;k++)
				{
					System.out.printf("%c",str.charAt(k));
				}
				return 0;
			}
		}
		System.out.println(str);
		return 0;
	}
}
