package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[1000]);
		int[] b = new int[300];
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			b[i] = 0;
		}
			j = 0;
			for (i = 0;i < a.length();i++)
			{

				if (a.charAt(i) != ' ')
				{
					b[j]++;
				}
				else
				{
					if (a.charAt(i + 1) != ' ')
					{
						j++;
					}
				}
			}
		for (i = 0;i < j + 1;i++)
		{
			if (i == j)
			{
				System.out.printf("%d\n",b[i]);
			}
			else
			{
				System.out.printf("%d,",b[i]);
			}
		}

		return 0;
	}


}
