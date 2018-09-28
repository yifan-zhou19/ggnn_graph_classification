package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1001]);
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		int index = 1;
		int[] num = new int[301];
		int i;
		int n = 0;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ' && index == 0)
			{
				index = 1;
				n++;
			}
			else if (a.charAt(i) != ' ' && index == 1)
			{
				num[n]++;
				index = 0;
			}
			else if (a.charAt(i) != ' ' && index == 0)
			{
				num[n]++;
			}
			else
			{
				index = index;
			}
		}
		if (n == 0)
		{
			System.out.printf("%d",num[0]);
		}
		else
		{
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d,",num[i]);
		}
		System.out.printf("%d",num[n]);
		}
	}

}
