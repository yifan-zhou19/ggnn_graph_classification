package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int n;
		int k = 0;
		int[] b = new int[100];
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) == ' ')
			{
				b[j] = i;
				j++;
			}
		}
		b[j] = n;
		b[-1] = 0;
		for (k = 0;k < j;k++)
		{
			for (i = b[j - 1 - k] + 1;i < b[j - k];i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.print(" ");
		}
		for (i = 0;i < b[0];i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
	}

}
