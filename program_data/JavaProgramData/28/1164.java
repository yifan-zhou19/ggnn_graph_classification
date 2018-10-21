package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[5000]);
		int n;
		int w;
		int i;
		int j;
		int m;
		s = new Scanner(System.in).nextLine();
		w = s.length();
		for (j = w - 1;s.charAt(j) == ' ';j--)
		{
			;
		}
		for (m = j;s.charAt(m) != ' ' && m > 0;m--)
		{
			;
		}
		if (m > 0)
		{
		i = 0;
		n = 0;
		while (i < m)
		{
			for (;s.charAt(i) == ' ';i++)
			{
				;
			}
			if (i < m)
			{
			   for (;s.charAt(i) != ' ';i++)
			   {
				  n++;
			   }
				 System.out.printf("%d,",n);
				 n = 0;
			}
		}
		System.out.printf("%d",j - m);
		}
		else
		{
			System.out.printf("%d",j - m + 1);
		}
	}
}
