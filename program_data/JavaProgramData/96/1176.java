package <missing>;

public class GlobalMembers
{
	/*??(12-11) ??13*/ 



	public static int Main()
	{
		String a = new String(new char[101]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		len = a.length();
		int[] b = new int[101];
		int i;
		int[] c = new int[101];
		for (i = 1;i <= len;i++)
		{
			b[i] = a.charAt(i - 1) - '0';
		}
		int hand = 0;
		i = 2;
		int num = b[1];
		while (i <= len) //????
		{
			num = num * 10 + b[i];
			hand++;
			c[hand] = num / 13;
			num = num % 13;
			i++;
		}
		i = 1;
		if (hand == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			while (c[i] == 0 && i < hand)
			{
				i++;
			}
			for (;i <= hand;i++)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

