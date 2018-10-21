package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] s = {'_', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		int i;
		int j;
		int k;
		int n;
		int b;
		char[][] a = new char[20][100];
		String m = new String(new char[2]);
		m = new Scanner(System.in).nextLine();
		n = Integer.parseInt(m);
		for (i = 0;i < n;i++)
		{
			b = 0;
			a[i] = new Scanner(System.in).nextLine();
			for (k = 0;k < 53;k++)
			{
				if (a[i][0] == s[k])
				{
					b++;
					break;
				}
			}
			for (j = 1;j < String.valueOf(a[i]).length();j++)
			{
				for (k = 0;k < 63;k++)
				{
					if (a[i][j] == s[k])
					{
						b++;
						break;
					}
				}
			}
			if (b == String.valueOf(a[i]).length())
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}




}
