package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int x = 0;
		int flag = 0;
		int count = 0;
		int[] a = new int[500];
		char[][] word = new char[500][50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a[i] = String.valueOf(word[i]).length() + 1;
		}
		i = 0;
		while (true)
		{
			while (count <= 81)
			{
				count += a[i];
				i++;
				if (i == n)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				System.out.print(word[x]);
				for (k = x + 1;k < n;k++)
				{
					System.out.print(" ");
					System.out.print(word[k]);
				}
				break;
			}
			i--;
			count = 0;
			System.out.print(word[x]);
			for (k = x + 1;k < i;k++)
			{
				System.out.print(" ");
				System.out.print(word[k]);
			}
			System.out.print("\n");
			x = i;
		}
		return 0;
	}
}

