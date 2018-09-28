package <missing>;

public class GlobalMembers
{
	public static int son(tangible.RefObject<String> a, int n)
	{
		int i;
		for (i = 0;i < n / 2;i++)
		{
		  if (a.argValue.charAt(i) != a.argValue.charAt(n - i - 1))
		  {
			  return 0;
		  }
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a.argValue.charAt(i));
		}
		System.out.print(a.argValue.charAt(n - 1));
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		String a = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n;
		n = a.length();
		for (int i = 2;i <= n;i++)
		{
		 for (int j = 0;j < n - i + 1;j++)
		 {
			 son(a.charAt(j), i);
		 }
		}
		return 0;
	}
}

