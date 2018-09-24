package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		int[] a = new int[52];
		int t;
		int j;
		int i;
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < 52;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < len;i++)
		{
			for (j = 0;j <= 25;j++)
			{
				if ((int)str.charAt(i) == j + 65)
				{
					a[j] = a[j] + 1;
				}
			}
			for (j = 0;j <= 25;j++)
			{
				if ((int)str.charAt(i) == j + 97)
				{
					a[j + 26] = a[j + 26] + 1;
				}
			}
		}
		for (i = 0,t = 0;i < 52;i++)
		{
			if (a[i] != 0)
			{
				t = 1;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (a[i] != 0)
				{
				System.out.printf("%c=%d\n",(char)i + 65,a[i]);
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (a[i + 26] != 0)
				{
				System.out.printf("%c=%d\n",(char)i + 97,a[i + 26]);
				}
			}
		}
	}

}
