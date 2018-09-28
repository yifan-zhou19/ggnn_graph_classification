package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		int[] num = new int[20];
		int i;
		int j;
		int flag;
		a = new Scanner(System.in).nextLine();
		for (i = 0, j = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				num[j] = num[j] * 10 + (a.charAt(i) - '0');
				flag = 1;
			}
			else if (i > 0 && a.charAt(i - 1) >= '0' && a.charAt(i - 1) <= '9')
			{
				j++;
				flag = 0;
			}
		}
		for (i = 0; i < j; i++)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
		if (flag == 1)
		{
			System.out.print(num[j]);
			System.out.print("\n");
		}
		return 0;
	}
}
