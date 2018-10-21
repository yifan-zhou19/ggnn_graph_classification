package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100000]);
		int[] c = new int[200];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int j;
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c, 0, (Integer.SIZE / Byte.SIZE));
			int l = s.length();
			for (int i = 0; i < l; i++)
			{
				c[s.charAt(i)]++;
			}
			for (j = 0; j < l; j++)
			{
				if (c[s.charAt(j)] == 1)
				{
					System.out.print(s.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (j == l)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}

}

