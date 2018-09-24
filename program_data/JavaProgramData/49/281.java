package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i;
		int j;
		int k;
		String str = new String(new char[200]);
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			n++;
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j <= n - i;j++)
			{
				int flag = 1;
				for (k = 0;k < i;k++)
				{
					if (str.charAt(j + k) != str.charAt(j + i - 1 - k))
					{
						flag = 0;
					}
				}
				if (flag != 0)
				{
					for (k = j;k <= i + j - 1;k++)
					{
						System.out.printf("%c",str.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
	}


}
