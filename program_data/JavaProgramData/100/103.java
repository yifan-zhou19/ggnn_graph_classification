package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int i;
		int j;
		int n;
		int t;
		int s = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
		}
		n = i;
		for (i = 97;i <= 122;i++)
		{
			t = 0;
			for (j = 0;j < n;j++)
			{
				if (a.charAt(j) == i)
				{
					t++;
				}
			}
			if (t != 0)
			{
				System.out.printf("%c=%d\n",i,t);
				s++;
			}
		}
		if (s == 0)
		{
			System.out.print("No\n");
		}
	}
}
