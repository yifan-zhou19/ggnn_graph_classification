package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int t;
		int i;
		t = a[n - 1];
		for (i = n - 1;i > 0;i--)
		{
			a[i] = a[i - 1];
		}
		a[0] = t;
	}
	public static void Main()
	{
		String s = new String(new char[300]);
		int i;
		int flag = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
			System.out.printf("%c",s.charAt(i));
			flag = 1;
			}
			else if (flag == 1)
			{
				System.out.print("\n");
				flag = 0;
			}
		}

	}
}
