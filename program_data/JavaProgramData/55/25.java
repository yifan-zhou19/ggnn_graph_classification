package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[32]);
	public static int[] b = new int[32];
	public static char[] trans = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int mid;
		int ar;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int len = a.length();
		for (k = 0;k < len;k++)
		{
			if ((a.charAt(k) >= '0') && (a.charAt(k) <= '9'))
			{
				a.charAt(k) -= '0';
			}
			if ((a.charAt(k) >= 'a') && (a.charAt(k) <= 'z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 'a' + 10);
			}
			if ((a.charAt(k) >= 'A') && (a.charAt(k) <= 'Z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 'A' + 10);
			}

		}
		mid = 0;
		ar = 1;
		for (j = len - 1;j >= 0;j--)
		{
			mid += a.charAt(j) * ar;
			ar *= n;
		}
		k = 0;
		while (mid != 0)
		{
			b[k] = mid % m;
			mid = mid / m;
			k++;
		}
		for (i = k - 1;i >= 0;i--)
		{
			if (b[i] != -1)
			{
				System.out.print(trans[b[i]]);
			}
		}
			System.out.print('\n');
		return 0;
	}

}

