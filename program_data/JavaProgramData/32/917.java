package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] na = new int[101];
		int[] nb = new int[101];
		int la;
		int lb;
		int i;
		int n;
		int j;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= n; j++)
		{

			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			la = a.length();
			lb = b.length();

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(na, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(nb, 0, (Integer.SIZE / Byte.SIZE));

			for (i = 0; i < la; i++)
			{
				na[i] = a.charAt(la - i - 1) - '0';
			}
			for (i = 0; i < lb; i++)
			{
				nb[i] = b.charAt(lb - i - 1) - '0';
			}

			for (i = 0; a.charAt(i) != '\0'; i++)
			{
				if (na[i] < nb[i])
				{
					na[i + 1]--;
					na[i] = 10 + na[i] - nb[i];
				}
				else
				{
					na[i] = na[i] - nb[i];
				}
			}

			for (i = i - 1; i >= 0; i--)
			{
				System.out.print(na[i]);
			}
				System.out.print("\n");

		}

		return 0;
	}
}

