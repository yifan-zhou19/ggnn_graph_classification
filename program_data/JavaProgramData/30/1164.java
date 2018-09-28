package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int s;
		int m;
		int x;
		int k;
		int n;
		float h; //h&Ecirc;&Ccedil;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1,s = 0;i <= n;i++)
		{
			for (m = i,x = 0;m != 0;m = (m - k) / 10) //x???n????????????7???
			{
				k = m % 10;
				if (k == 7)
				{
					x++;
					break;
				}
			}
			if ((i % 7 != 0) && (x == 0))
			{
				s += i * i;
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

