package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int s;
		int s1;
		int s2;
		int b;
		int b1;
		int b2;
		int[] n = new int[50];
		char c;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;(c = a.charAt(i)) != '\0';i++)
		{
			if (c == ' ')
			{
				n[j] = i;
				j++;
			}
		}
		n[j] = i;
		b = n[0] + 1;
		s = n[0] + 1;
		for (i = 0; i < j ; i++)
		{
			if ((n[i + 1] - n[i]) > b)
			{
				b = n[i + 1] - n[i];
				b1 = n[i];
				b2 = n[i + 1];
			}
			if ((n[i + 1] - n[i]) < s)
			{
				s = n[i + 1] - n[i];
				s1 = n[i];
				s2 = n[i + 1];
			}
		}
		if (b == n[0] + 1)
		{
			for (i = 0;i < b - 1;i++)
			{
		System.out.printf("%c", a.charAt(i));
			}
		}
		else
		{
			for (i = b1 + 1;i < b2;i++)
			{
		System.out.printf("%c", a.charAt(i));
			}
		}
		System.out.print("\n");
		if (s == n[0] + 1)
		{
			for (i = 0;i < s - 1;i++)
			{
		System.out.printf("%c", a.charAt(i));
			}
		}
		else
		{
			for (i = s1 + 1;i < s2;i++)
			{
		System.out.printf("%c", a.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}

}
