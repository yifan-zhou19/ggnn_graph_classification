package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i;
		int j;
		int k;
		int l0;
		int l;
		str = new Scanner(System.in).nextLine();
		l0 = str.length();
		for (l = 2;l <= l0;l++)
		{

			for (i = 0;i <= l0 - l;i++)
			{

				a = 0;
				for (j = 0;j < l / 2;j++)
				{

					if (str.charAt(i + j) != str.charAt(l - j + i - 1))
					{
						a = 1;
						break;
					}
				}
					if (a == 0)
					{
					for (j = i;j < i + l;j++)
					{
						System.out.printf("%c",str.charAt(j));
					}
					System.out.print("\n");
					}
			}
		}


	}
}
