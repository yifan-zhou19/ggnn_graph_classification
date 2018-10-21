package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[100]);
		char mid;
		int i;
		int[] num = new int[1000];
		int j;
		int l1;
		int l2;
		int judge;
		int count;
		count = 0;
		a = new Scanner(System.in).nextLine();
		l1 = a.length();
		for (i = 0;i < l1;i++)
		{
			if (a.charAt(i) != ' ')
			{
				num[count]++;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			{
				count++;
			}
		}
		for (i = 0;i <= count;i++)
		{
			System.out.printf("%d",num[i]);
			if (i != count)
			{
				System.out.print(",");
			}
		}
		return 0;
	}
}
