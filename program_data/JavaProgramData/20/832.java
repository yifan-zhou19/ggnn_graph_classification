package <missing>;

public class GlobalMembers
{
	public static void insert(String a, String b)
	{
		int len;
		len = a.length();
		int i;
		int temp = 0;
		for (i = 0;i < len;i++)
		{
			if (a[temp] - a[i] < 0 != null)
			{
				temp = i;
			}
		}
		for (i = 0;i <= temp;i++)
		{
			System.out.print(a[i]);
		}
		System.out.print(b[0]);
		System.out.print(b[1]);
		System.out.print(b[2]);
		for (i = temp + 1;i < len;i++)
		{
			System.out.print(a[i]);
		}
			 System.out.print("\n");
	}
	public static int Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0'};
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			insert(str, substr);
		}
		return 0;
	}

}

