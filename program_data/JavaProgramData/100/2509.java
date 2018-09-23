package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[301]);
		int b;
		int i;
		int j;
		int k;
		int n;
		int jihao = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < 26;i++)
		{
			b = 0;
			for (j = 0;j < n;j++)
			{
				if (a.charAt(j) == 'A' + i)
				{
					b = b + 1;
					jihao = 1;
				}
			}
			if (b != 0)
			{
				System.out.printf("%c=%d\n",'A' + i,b);
			}
		}
		for (i = 0;i < 26;i++)
		{
			b = 0;
			for (j = 0;j < n;j++)
			{
				if (a.charAt(j) == 'a' + i)
				{
					b = b + 1;
					jihao = 1;
				}
			}
			if (b != 0)
			{
				System.out.printf("%c=%d\n",'a' + i,b);
			}
		}
		if (jihao == 0)
		{
			System.out.print("No");
		}
	}
}
