package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		String p;
		int n;
		int i;
		int t = 0;
		int m;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		p = s;
		for (i = n - 1;i >= 0;i--)
		{
			t = t + 1;
		//	printf("|%c|",*(p+i));
			if (s.charAt(i) == ' ')
			{
				for (m = 1;m <= t - 1;m++)
				{
			System.out.printf("%c",*(p.Substring(i) + m));
				}
			System.out.print(" ");
			//printf("t=%d",t);
			t = 0;
			}
			if (i == 0)
			{
				for (m = 0;m < t;m++)
				{
					System.out.printf("%c",*(p.Substring(i) + m));
				}
			}
		}
	}


}
