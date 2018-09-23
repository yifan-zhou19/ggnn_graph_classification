package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		char j;
		int[] b = new int[53];
		int i;
		int flag = 0;
		int l;
		int k = 1;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (j = 'A';j <= 'Z';j++,k++)
		{
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == j)
				{
					b[k]++;
					flag++;
				}
			}
		}
		for (j = 'a';j <= 'z';j++,k++)
		{
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == j)
				{
					b[k]++;
					flag++;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 1;i <= 52;i++)
			{
				if (b[i] != 0)
				{
					if (i <= 26)
					{
						System.out.printf("%c=%d\n",i + 64,b[i]);
					}
					else if (i >= 27)
					{
						System.out.printf("%c=%d\n",i + 70,b[i]);
					}
				}
			}
		}

		return 0;
	}

}
