package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len = 1;
		int[] num = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] p = num;
		int carry = 0;
		num [0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			p = num;
			carry = 0;
			while (p < num + len)
			{
				p[0] *= 2;
				p[0] += carry;
				carry = 0;
				while (p[0] > 9)
				{
					carry++;
					p[0] -= 10;
				}
				p++;
			}
			if (carry != 0)
			{
				len++;
				p[0] = carry;
			}
		}
		if (p[0] == 0)
		{
			p--;
		}
		while (p >= num)
		{
			System.out.print(p);
			p--;
		}
		return 0;
	}


}

