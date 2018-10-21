package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int count = 0;
		int i;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) == str.charAt(i + 1) || str.charAt(i) == str.charAt(i + 1) + 'a' - 'A' || str.charAt(i) == str.charAt(i + 1) + 'A' - 'a')
			{
				count++;
			}
			else
			{
				count++;
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				{
					System.out.print("(");
					System.out.print(str.charAt(i));
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
				}
				else
				{
					str.charAt(i) += 'A' - 'a';
					System.out.print("(");
					System.out.print(str.charAt(i));
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
				}
				count = 0;
			}
		}
		System.out.print("\n");
		return 0;
	}



}

