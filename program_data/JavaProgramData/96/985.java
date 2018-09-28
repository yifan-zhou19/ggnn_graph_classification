package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		int i;
		int num;
		int r;
		for (i = 0; i < len; i++)
		{
			num1[i] = str.charAt(i) - '0';
		}
		if (len >= 3)
		{
			for (i = 0; i < len - 1; i++)
			{
				num = num1[i] * 10 + num1[i + 1];
				num2[i] = num / 13;
				r = num % 13;
				num1[i + 1] = r;
			}
			if (num2[0] != 0)
			{
				for (i = 0; i < len - 1; i++)
				{
					System.out.print(num2[i]);
				}
			}
			else
			{
				for (i = 1; i < len - 1; i++)
				{
					System.out.print(num2[i]);
				}
			}
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}
		else if (len == 2)
		{
			int s;
			num = num1[0] * 10 + num1[1];
			s = num / 13;
			r = num % 13;
			System.out.print(s);
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(num1[0]);
			System.out.print("\n");
		}
		return 0;
	}

}

