package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[53];
		int[] c = new int[53];
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int len;
		int flag = 0;
		len = a.length();
		for (i = 1;i <= 26;i++)
		{
			for (j = 0;j < len;j++)
			{
				if (a.charAt(j) == i + 64)
				{
					c[i] += 1;
				}
			}
		}
		for (i = 27;i <= 52;i++)
		{
			for (j = 0;j < len;j++)
			{
				if (a.charAt(j) == i + 70)
				{
					c[i] += 1;
				}
			}
		}
		for (i = 1;i <= 26;i++)
		{
			if (c[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 64,c[i]);
				flag = 1;
			}
		}
		for (i = 27;i <= 52;i++)
		{
			if (c[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 70,c[i]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}
