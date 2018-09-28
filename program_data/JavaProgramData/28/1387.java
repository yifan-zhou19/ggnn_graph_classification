package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int j;
		int k;
		int m = 0;
		int n;
		a = new Scanner(System.in).nextLine();
		k = a.length();
		n = 0;
		for (i = n;i < k;)
		{
			m = 0;
			if (a.charAt(i) != ' ')
			{
				for (j = i;a.charAt(j) != ' ' && a.charAt(j) != '\0';j++)
				{
					m++;
				}
				n = j;
				if (i == 0)
				{
					System.out.printf("%d",m);
				}
				if (i > 0)
				{
					System.out.printf(",%d",m);
				}
				i = n;
			}
			else
			{
				n = n + 1;
				i = n;
			}
		}
		return 0;
	}


}
