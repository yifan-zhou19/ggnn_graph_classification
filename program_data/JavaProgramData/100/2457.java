package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[128];
		final String s = "";
		int i;
		int len;
		int tem;
		int flag = 0;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			tem = s.charAt(i) - '0';
			if (tem >= 'a'-'0' && tem <= 'z'-'0')
			{

				a[tem]++;
			}
			else if (tem >= 'A'-'0' && tem <= 'Z'-'0')
			{
				a[tem]++;
			}
		}
		for (i = 'A'-'0';i <= 'Z'-'0';i++)
		{
			if (a[i] != 0)
			{
				flag++;
				System.out.printf("%c=%d\n",i + '0',a[i]);
			}
		}
		for (i = 'a'-'0';i <= 'z'-'0';i++)
		{
			if (a[i] != 0)
			{
				flag++;
				System.out.printf("%c=%d\n",i + '0',a[i]);
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}
