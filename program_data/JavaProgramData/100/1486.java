package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[52];
		int i;
		int n;
		int k;
		int j;
		for (i = 0;i < 52;i++)
		{
			b[i] = 0;
		}
		j = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				k = a.charAt(i) - 65;
				b[k] = b[k] + 1;
			}
			if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
			{
				k = a.charAt(i) - 71;
				b[k] = b[k] + 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 65,b[i]);
				j++;
			}
		}
		for (i = 26;i < 52;i++)
		{
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 71,b[i]);
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
	}


}
