package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[5000]);
		int i;
		int j = 0;
		int n = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != 0;i++,n++)
		{
			if (str.charAt(i) == ' ')
			{

				if (n > 0)
				{
					if (j == 0)
					{
						System.out.printf("%d",n);
						j = 1;
					}
					else
					{
						System.out.printf(",%d",n);
					}
				}
				n = -1;
			}
		}
		if (j == 0)
		{
			System.out.printf("%d",n);
			j = 1;
		}
		else
		{
			System.out.printf(",%d",n);
		}
	}
}
