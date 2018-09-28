package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[30000]);
		int[] a = new int[300];
		int i;
		int j = 0;
		int flag = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < c.length();i++)
		{
			if (c.charAt(i) == ' ')
			{
				flag = 0;
			}
			else if (flag == 0)
			{
				flag = 1;
				j++;
			}
			{
			if (flag == 1)
			{
				a[j - 1]++;
			}
		}
		}
		for (i = 0;a[i] != 0;i++)
		{
			if (a[i + 1] == 0)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf("%d,",a[i]);
			}
		}
	}
}
