package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????13                 **
	//*??????                 **
	//*???2012.11.10             **
	//*******************************/


	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int[] s = new int[100];
		int n;
		int i;
		int flag = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.length();
		for (i = 0; i < n; i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		for (i = 1; i < n; i++)
		{
			s[i] = (10 * b[i - 1] + b[i]) / 13;
			b[i] = (10 * b[i - 1] + b[i]) % 13;
		}
		if (s[1] != 0)
		{
			System.out.print(s[1]);
			flag = 1;
		}
		for (i = 2; i < n; i++)
		{
			System.out.print(s[i]);
			flag = 1;
		}
		if (flag == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		System.out.print(b[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

