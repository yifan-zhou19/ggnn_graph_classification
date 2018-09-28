package <missing>;

public class GlobalMembers
{
	public static char boy;

	public static int res(String str, int n, int idx)
	{
		if (str[idx].equals(boy))
		{
			int ridx = res(str, n, idx + 1);
			System.out.print(idx);
			System.out.print(" ");
			System.out.print(ridx);
			System.out.print("\n");
			if (ridx < n - 1)
			{
				ridx = res(str, n, ridx + 1);
			}
			else
			{
				ridx = ridx + 1;
			}
			return ridx;
		}
		else
		{
			return idx;
		}
	}
	public static int Main()
	{
		String str = new String(new char[102]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = str.charAt(0);
		res(str, str.length(), 0);
		return 0;
	}


}

