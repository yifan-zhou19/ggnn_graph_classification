package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String child = new String(new char[100]);
		char a;
		child = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = child.charAt(0);
		int i = 0;
		int j = 0;
		while (child.charAt(0) != 0)
		{
			if (child.charAt(i) != a && child.charAt(i) != 0)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (child.charAt(j) == a)
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						child = child.substring(0, i);
						child = child.substring(0, j);
						break;
					}
				}
			}
			i++;
		}

		return 0;
	}


}

