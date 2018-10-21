package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		//cin.get();
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 0;
		int flag = 0;
		while (b.charAt(i) != '\0')
		{
			int k = 0;
			while (b.charAt(i) == a.charAt(k))
			{
				if (k == a.length() - 1)
				{
				System.out.print(i - a.length() + 1);
				System.out.print("\n");
				flag = 1;
				break;
				}
				k++;
				i++;
			}
			if (flag == 1)
			{
				break;
			}
			i++;
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

