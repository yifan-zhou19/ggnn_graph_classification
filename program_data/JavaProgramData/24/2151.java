package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[1000]);
		int i;
		int count = 0;
		int max;
		int min;
		int mark1;
		int mark2;
		int length;
		c = new Scanner(System.in).nextLine();
		length = c.length();
		for (i = 0;i < length + 1;i++)
		{
			if (c.charAt(i) != ' ' && c.charAt(i) != '\0')
			{
				count++;
			}
			else
			{
				if (c.charAt(i - 1) == ',')
				{
					count--;
				}
				max = min = count;
				count = 0;
				mark1 = mark2 = 0;
				break;
			}
		}
		for (i = 0;i < length + 1;i++)
		{
			if (c.charAt(i) != ' ' && c.charAt(i) != '\0')
			{
				count++;
			}
			else
			{
				if (c.charAt(i - 1) == ',')
				{
					count--;
				}
				if (max < count)
				{
					max = count;
					mark1 = i - max;
				}
				if (min > count)
				{
					min = count;
					mark2 = i - min;
				}
				count = 0;
			}
		}
		for (i = 0;i < max;i++)
		{
			System.out.printf("%c",c.charAt(mark1 + i));
		}
		System.out.print("\n");
		for (i = 0;i < min;i++)
		{
			System.out.printf("%c",c.charAt(mark2 + i));
		}
		System.out.print("\n");
	}
}
