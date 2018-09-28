package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		String p = a;
		char n;
		char i;
		String max;
		String min;
		char x = 0;
		char y = 100;
		char word = 0;
		a = new Scanner(System.in).nextLine();
		max = a;
		min = a;
		for (i = 0,n = a.length(),p = a;i < n;i++)
		{
			word++;
			if (*(p + i) == ' ')
			{
				word--;
				if (word > x)
				{
					x = word;
					max = p + i - x;
				}
				if (word < y)
				{
					y = word;
					min = p + i - y;
				} //???????
				word = 0;
			}
			if (i == n - 1)
			{
				if (word > x)
				{
					x = word;
					max = p + i - x + 1;
				}
				if (word < y)
				{
					y = word;
					min = p + i - y + 1;
				}
			}
		}
		for (p = max;p < max + x;p++)
		{
			System.out.printf("%c", p);
			if (p == max + x - 1)
			{
				System.out.print("\n");
			}
		}
		for (p = min;p < min + y;p++)
		{
			System.out.printf("%c", p);
		}
	}
}
