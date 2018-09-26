package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int p;
		int carry = 0;
		int x;
		int y;
		int n0 = 0;
		int[] result = new int[260];
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE));
		w = a.length() <= b.length()?a.length():b.length();
		p = a.length() >= b.length()?a.length():b.length();
		for (int i = 0 ; i < p ; i++)
		{
			if (i <= w - 1)
			{
			x = a.charAt(a.length() - 1 - i) - '0';
			y = b.charAt(b.length() - 1 - i) - '0';
			}
			else
			{
						if (a.length() <= b.length())
						{
						x = 0;
						y = b.charAt(b.length() - 1 - i) - '0';
						}
						else
						{
						x = x = a.charAt(a.length() - 1 - i) - '0';
						y = 0;
						}
			}
			if (x + y + carry >= 10)
			{
			result[i] = x + y + carry - 10;
			carry = 1;
			}
			else
			{
			result[i] = x + y + carry;
			carry = 0;
			}
			if (i == p - 1 && carry == 1)
			{
			result[i + 1] = carry;
			}
		}
		if (carry == 1)
		{
		p++;
		}
		for (int j = p - 1;j >= 0;j--)
		{
		if (result[j] == 0)
		{
			n0++;
			for (int q = p - 1;q >= j;q--)
			{
			if (result[q] != 0)
			{
			System.out.printf("%d",result[j]);
			break;
			}
			}
		}
		else
		{
		System.out.printf("%d",result[j]);
		}
		if (n0 == p)
		{
		System.out.printf("%d",result[j]);
		}
		}
	return 0;
	}
}
