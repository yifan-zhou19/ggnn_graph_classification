package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int min = 100;
		int i;
		int j;
		int m;
		int n;
		int word = 0;
		String a = new String(new char[5000]);
		char c;
		String maxw = new String(new char[20]);
		String minw = new String(new char[20]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;(c = a.charAt(i)) != '\0';i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',')
			{
				word++;
			}
			else if ((a.charAt(i) == ' ' || a.charAt(i) == ',') && (a.charAt(i + 1) == ' ' || a.charAt(i + 1) == ','))
			{
				i++;
			}
			else
			{
				if (word > max)
				{
				max = word;
				m = i;
				}
			if (word < min)
			{
				min = word;
				n = i;
			}
			word = 0;
			}
		}
		if (word > max)
		{
			max = word;
			m = i;
		}
		if (word < min)
		{
			min = word;
			n = i;
		}
			for (i = (m - max);i < m;i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
		System.out.print("\n");
		for (j = (n - min);j < n;j++)
		{
			System.out.printf("%c",a.charAt(j));
		}
		return 0;
	}
}
