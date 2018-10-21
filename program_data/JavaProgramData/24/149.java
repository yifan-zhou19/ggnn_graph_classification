package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		int i;
		int j = 1;
		int[] b = new int[500];
		int c;
		int d;
		int e = 0;
		int f = 0;
		a = new Scanner(System.in).nextLine(); //????????
		b[0] = -1;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				b[j] = i;
				j++;
			}
		}
		b[j] = i;
		c = b[1] - b[0];
		d = b[1] - b[0];
		for (i = 1;i <= j;i++)
		{
			if ((b[i] - b[i - 1]) > c)
			{
				c = b[i] - b[i - 1];
				e = i - 1;
			}
			if ((b[i] - b[i - 1]) < d)
			{
				d = b[i] - b[i - 1];
				f = i - 1;
			}
		}
		for (i = (b[e] + 1);i < b[e+1];i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n\n");
		for (i = (b[f] + 1);i < b[f + 1];i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
}
