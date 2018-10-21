package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1500]);
		int[] t = new int[4];
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		s = new Scanner(System.in).nextLine();
		a = -1;
		b = -1;
		j = 0;
		for (i = 0;i < s.length() + 1;i++)
		{
			if (s.charAt(i) != ',' && s.charAt(i) != '\0')
			{
				t[j] = s.charAt(i) - '0';
				j++;
			}
			else
			{
				switch (j)
				{
				case 1:
					c = t[0];
					break;
				case 2:
					c = 10 * t[0] + t[1];
					break;
				case 3:
					c = 100 * t[0] + 10 * t[1] + t[2];
					break;
				case 4:
					c = 1000 * t[0] + 100 * t[1] + 10 * t[2] + t[3];
					break;
				default:
					break;
				}
				j = 0;
				if (c > a)
				{
					b = a;
					a = c;
				}
				else if (c < a && c> b)
				{
					b = c;
				}
			}
		}
		if (b == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",b);
		}
		return 0;
	}
}
