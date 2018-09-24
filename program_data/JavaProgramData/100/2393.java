package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] A = new int[26];
		int[] a = new int[26];
		int l;
		int i;
		int n;
		int m = 0;
		String sen = new String(new char[500]);
		sen = new Scanner(System.in).nextLine();
		l = sen.length();
		for (i = 0;i < l;i++)
		{
			if (sen.charAt(i) >= 'a' && sen.charAt(i) <= 'z')
			{
				m = 1;
				a[sen.charAt(i) - 'a']++;
			}
			if (sen.charAt(i) >= 'A' && sen.charAt(i) <= 'Z')
			{
				m = 1;
				A[sen.charAt(i) - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (A[i] != 0)
			{
				System.out.printf("%c=%d\n",'A' + i,A[i]);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",'a' + i,a[i]);
			}
		}
			if (m == 0)
			{
				System.out.print("No");
			}
	}

}
