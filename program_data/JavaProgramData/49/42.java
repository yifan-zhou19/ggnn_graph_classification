package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[501]);
		int i;
		int j;
		int k;
		int length;
		int n;
		int s;
		str = new Scanner(System.in).nextLine();
		length = str.length();
		for (i = 2;i <= length;i++)
		{
			for (j = 0;j < length;j++)
			{
				k = 0;
				  for (n = 0;n < i;n++)
				  {
					if (str.charAt(j + n) == str.charAt(j + i - n - 1))
					{
						 k++;
					}
					if (k == i)
					{
						for (s = j;s <= j + n;s++)
						{
							System.out.printf("%c",str.charAt(s));
						}
							System.out.print("\n");
					}
				  }
			}
		}
		return 0;
	}
}
