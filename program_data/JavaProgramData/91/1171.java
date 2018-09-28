package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[1000];
		String a = new String(new char[1000]);
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			b[i] = a.charAt(i);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%c",b[i] + b[i + 1]);
		}
		System.out.printf("%c",b[n - 1] + b[0]);


		return 0;
	}
}
