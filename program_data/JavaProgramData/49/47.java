package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[505]);
		int i;
		int j;
		int k;
		int count;
		a = new Scanner(System.in).nextLine();

		for (i = 2;i <= a.length();i++)
		{
			for (j = 0;(j + i) <= a.length();j++)
			{
				count = 0;
				for (k = 0;k < (i / 2);k++)
				{
					if (a.charAt(j + k) == a.charAt(j + i - 1 - k))
					{
						count++;
					}
				}
				if (count == i / 2)
				{
					for (k = j;k < j + i;k++)
					{
						System.out.printf("%c",a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
	}

}
