package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[31]);
		int i;
		int j;
		int k;
		int[] a = new int[31];
		s = new Scanner(System.in).nextLine();
		k = s.length();
		for (i = 0;i < 31;i++)
		{
			a[i] = -1;
		}
		for (i = 0;i < k;i++)
		{
			if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9)
			{
				a[i] = s.charAt(i) - '0';
			}
		}
		for (i = 0;i < k;i++)
		{
			if (a[i] != -1 && a[i + 1] != -1)
			{
				System.out.printf("%d",a[i]);
			}
			else if (a[i] != -1 && a[i + 1] == -1)
			{
				System.out.printf("%d\n",a[i]);
			}
		}
		return 0;
	}
}
