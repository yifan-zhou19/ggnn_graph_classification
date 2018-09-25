package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int k;
		int i;
		int temp = 0;
		char[][] b = new char[1000][50]; //??????????
		String[] p = new String[1000]; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		k = 1;
		while (k <= n)
		{
			b[k] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p[k] = b[k]; //??????????
			k++;
		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(p[i]);
			temp++;
			temp += String.valueOf(b[i]).length();
				if (temp + String.valueOf(b[i + 1]).length() > 80)
				{
					System.out.print("\n");
					temp = 0;
				} //???80????????
				else if (i != n)
				{
					System.out.print(" ");
				}
		}
		return 0;
	}
}

