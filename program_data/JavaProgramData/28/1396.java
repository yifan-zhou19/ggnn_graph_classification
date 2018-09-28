package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		int[] length = new int[301];
		int i;
		int geshu = 0;
		int state = OUT;

		geshu = 0;

		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				state = OUT;
			}
			else
			{
				if (state == OUT)
				{
					geshu++;
					length[geshu]++;
					state = IN;
				}
				else if (state == IN)
				{
					length[geshu]++;
				}
			}
		}

		for (i = 1;i < geshu;i++)
		{
			System.out.printf("%d,",length[i]);
		}
		System.out.printf("%d",length[geshu]);

		return 0;
	}

}
