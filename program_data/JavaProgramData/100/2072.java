package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		int i;
		int j;
		int[] count = new int[300];
		int lon;
		int t = 0;
		str = new Scanner(System.in).nextLine();
		lon = str.length();
		for (i = 'A';i <= 'Z';i++)
		{
			for (j = 1;j <= lon;j++)
			{
				if (str.charAt(j - 1) == i)
				{
					count[i - 1]++;
				}
			}
		}
		for (i = 'a';i <= 'z';i++)
		{
			for (j = 1;j <= lon;j++)
			{
				if (str.charAt(j - 1) == i)
				{
					count[i - 1]++;
				}
			}
		}
		for (i = 1;i <= 300;i++)
		{
			if (count[i - 1] != 0)
			{
				t = 1;
				break;
			}
		}
			if (t == 0)
			{
				System.out.print("No");
			}
			else
			{
				for (i = 1;i <= 300;i++)
				{
					if (count[i - 1] != 0)
					{
						System.out.printf("%c=%d\n",i,count[i - 1]);
					}
				}
			}
	}
}
