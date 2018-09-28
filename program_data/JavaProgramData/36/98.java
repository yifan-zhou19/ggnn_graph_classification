package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int x;
		a = new Scanner(System.in).nextLine();
		x = a.length();
		if (x % 2 == 0)
		{
		System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				int k = 0;
				int j;
				for (j = 0;j < x;j++)
				{
					if (a.charAt(j) == a.charAt(i) && a.charAt(j) != ' ')
					{
					k++;
					}
				}
				if (k % 2 != 0)
				{
					System.out.print("NO\n");
					return 0;
				}
			}
			System.out.print("YES\n");
		}
	}


}
