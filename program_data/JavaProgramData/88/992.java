package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
		int i = 0;
		int num = 0;
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				num = num * 10 + (str.charAt(i) - '0');
				if (!(str.charAt(i + 1) >= '0' && str.charAt(i + 1) <= '9') || str.charAt(i + 1) == '\0')
				{
					System.out.print(num);
					System.out.print("\n");
					num = 0;
				}
			}
			i++;
		}
		return 0;
	}
}
