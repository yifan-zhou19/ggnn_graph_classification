package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int[] c = new int[300];
		int l1;
		int l2;
		int max;
		int flag = 0;
		l1 = a.length();
		l2 = b.length();
		if (l1 > l2)
		{
			max = l1;
		}
		else
		{
			max = l2;
		}
		int i;
		for (i = 0;i < max;i++)
		{
			if (i < l1 && i < l2)
			{
				c[i + 1] += (c[i] + a.charAt(l1 - 1 - i) + b.charAt(l2 - 1 - i) - 2 * '0') / 10;
				c[i] = (c[i] + a.charAt(l1 - 1 - i) + b.charAt(l2 - 1 - i) - 2 * '0') % 10;
			}
			else if (i < l1 && i >= l2)
			{
				c[i + 1] += (c[i] + a.charAt(l1 - 1 - i) - '0') / 10;
				c[i] = (c[i] + a.charAt(l1 - 1 - i) - '0') % 10;
			}
			else if (i < l2 && i >= l1)
			{
				c[i + 1] += (c[i] + b.charAt(l2 - 1 - i) - '0') / 10;
				c[i] = (c[i] + b.charAt(l2 - 1 - i) - '0') % 10;
			}
		}
		for (i = max;i >= 0;i--)
		{
			if (i == 0 && flag == 0)
			{
			System.out.printf("%d",c[i]);
			}
			if (c[i] == 0 && flag == 0)
			{
			continue;
			}
			System.out.printf("%d",c[i]);
			flag = 1;
		}
		return 0;
	}
}
