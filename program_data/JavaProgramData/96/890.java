package <missing>;

public class GlobalMembers
{
	public static int[] ans = new int[110];
	public static int[] num = new int[110];
	public static int sig = 0;
	public static void devide(int a, int b,int tag)
	{
		ans[sig] = (num[a] * 10 + num[b]) / 13;
		num[b] = (num[a] * 10 + num[b]) % 13;
		sig++;
		if (b == tag - 1)
		{
			if (sig == 1)
			{
				System.out.print(ans[0]);
				System.out.print("\n");
			}
			else
			{
			int flag = 0;
			for (int i = 0 ; i < sig ; i++)
			{
				if (ans[i] != 0)
				{
					flag = 1;
				}
				if (i != sig - 1 && flag != 0)
				{
					System.out.print(ans[i]);
				}
				else if (i == sig - 1 && flag != 0)
				{
					System.out.print(ans[i]);
					System.out.print("\n");
				}
			}
			}
			System.out.print(num[b]);
			System.out.print("\n");
			return;
		}
		else
		{
			devide(b, b + 1, tag);
		}
	}
	public static int Main()
	{
		int tag = 0;
		String str = new String(new char[110]);
		char x;
		x = System.in.read();
		while (x != '\n' && x != ' ')
		{
			str = tangible.StringFunctions.changeCharacter(str, tag, x);
			tag++;
			x = System.in.read();
		}
		for (int i = 0 ; i < tag ; i++)
		{
			num[i] = str.charAt(i) - '0';
		}
		if (tag == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(num[0]);
			System.out.print("\n");
		}
		else
		{
			devide(0, 1, tag);
		}
		return 0;
	}

}

