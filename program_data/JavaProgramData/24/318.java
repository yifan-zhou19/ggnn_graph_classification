package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int[] b = new int[50];
		int i;
		int j = 0;
		int c;
		int[] d = new int[50];
		int max = 0;
		int min = 1000;
		int k;
		a = new Scanner(System.in).nextLine();
		c = a.length();
		b[0] = 0;
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) == ' ')
			{
				j++;
				b[j] = i + 1;
			}
		}
			b[j + 1] = c + 1;
		for (i = 0;i < j + 1;i++)
		{
			d[i] = b[i + 1] - b[i] - 1;
			max = (max >= d[i])?max:d[i];
			min = (min >= d[i])?d[i]:min;
		}
		for (i = 0;i < j + 1;i++)
		{
			if (d[i] == max)
			{
				for (k = b[i];k < b[i + 1] - 1;k++)
				{
					System.out.printf("%c",a.charAt(k));
				}
					break;
			}
		}
		System.out.print("\n");
		for (i = 0;i < j + 1;i++)
		{
			if (d[i] == min)
			{
				for (k = b[i];k < b[i + 1] - 1;k++)
				{
					System.out.printf("%c",a.charAt(k));
				}
					break;
			}
		}
	}
}
