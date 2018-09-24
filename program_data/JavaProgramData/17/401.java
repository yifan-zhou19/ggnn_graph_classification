package <missing>;

public class GlobalMembers
{
	public static int findl(int i, String a, int n)
	{
		int k = i + 1;
		while (k < n)
		{
			if (a[k].equals('('))
			{
				k = findl(k, a, n); //????????????
			}
			else if (a[k].equals(')'))
			{
				return k;
			}
			k++;
		}
		return n + 1;
	}
	public static int find(int i, String a)
	{
		int k = i - 1;
		while (k >= 0)
		{
			if (a[k].equals(')'))
			{
				k = find(k, a);
			}
			else if (a[k].equals('('))
			{
				return k;
			}
			k--;
		}
		return -1;
	}
	public static int Main()
	{
		String a = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'\n',102);
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int n = a.length();
			System.out.print(a);
			System.out.print("\n");
			for (int i = 0;i < n;i++)
			{
				int x = 0;
				if (a.charAt(i) == '(' && findl(i, a, n) > n)
				{
					System.out.print("$");
				}
				else if (a.charAt(i) == ')' && find(i, a) < 0)
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}

