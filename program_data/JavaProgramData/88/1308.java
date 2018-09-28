package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		int[] b = new int[31];
		int i;
		int j;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
			{
			  b[i] = 1;
			}
		}
			for (j = 0;j < l;j++)
			{
				if (b[j] == 1)
				{
					System.out.print(a.charAt(j));
				}
				else
				{
					System.out.print("\n");
				}
			}

	   return 0;
	}

}
