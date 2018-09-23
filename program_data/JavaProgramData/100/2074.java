package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[30];
		int[] A = new int[30];
		int i;
		int m;
		int flag = 0;
		String str = new String(new char[300]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a')
			{
				m = str.charAt(i) - 'a';
				a[m]++;
			}
			else if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A')
			{
				m = str.charAt(i) - 'A';
				A[m]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (A[i] != 0)
			{
			System.out.printf("%c=%d\n", 'A' + i, A[i]), flag = 1;
			};
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
			System.out.printf("%c=%d\n", 'a' + i, a[i]), flag = 1;
			};
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}
