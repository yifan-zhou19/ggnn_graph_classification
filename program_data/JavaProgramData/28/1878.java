package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zifu = new String(new char[5000]);
		zifu = new Scanner(System.in).nextLine();
		int len;
		len = zifu.length();
		int i;
		int t = 0;
		int j = 0;
		for (i = 0;i <= len;i++)
		{
			if (zifu.charAt(i) != ' ')
			{
				t++;
				if (zifu.charAt(i + 1) == '\0')
				{
					j++;
					if (j == 1)
					{
						System.out.printf("%d",t);
					}
					else
					{
						System.out.printf(",%d",t);
					}

					return 0;
				}


			}
			else if (zifu.charAt(i) == ' ' && zifu.charAt(i + 1) != ' ')
			{
				j++;
				if (j == 1)
				{
					System.out.printf("%d",t);
				}
				else
				{
					System.out.printf(",%d",t);
				}
				t = 0;
			}
		}





		return 0;

	}

}
