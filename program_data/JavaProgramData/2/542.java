public class a
{
	public int number;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static a[] b = tangible.Arrays.initializeWithDefaultaInstances(100);
	public static int Main()
	{
		int[] L = new int[26];
		int n = 0;
		int max = 0;
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			b[i].number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i].author = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (int j = 0;b[i].author.charAt(j) != '\0';j++)
			{
				L[b[i].author.charAt(j) - 'A']++;
			}
		}
		for (int i = 0;i < 26;i++)
		{
			if (max < L[i])
			{
				p = i;
				max = L[i];
			}
		}
		System.out.print((char)(p + 'A'));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;b[i].author.charAt(j) != '\0';j++)
			{
				if (b[i].author.charAt(j) - p == 'A')
				{
					System.out.print(b[i].number);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

