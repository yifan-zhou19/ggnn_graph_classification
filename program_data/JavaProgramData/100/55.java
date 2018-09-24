package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		char min;
		char tr;
		int i;
		int j;
		int t = 0;
		int flag;
		int te;
		int l;
		final String b = "";
		int[] c = new int[300];
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			flag = 0;
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				for (j = 0;j < 300;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						c[j] = c[j] + 1;
					flag = 1;
					}
				}
					if (flag != 1)
					{
						b = tangible.StringFunctions.changeCharacter(b, t, a.charAt(i));
						c[t] = c[t] + 1;
						t = t + 1;
					}
			}
		}
		l = b.length();
		for (i = 0;i < l;i++)
		{
			min = i;
			for (j = i;j < l;j++)
			{
				if (b.charAt(j) < b.charAt(min))
				{
					min = j;
				}
			}
			if (min != i)
			{
				tr = b.charAt(i);
				te = c[i];
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(min));
				c[i] = c[min];
				b = tangible.StringFunctions.changeCharacter(b, min, tr);
				c[min] = te;
			}
		}
		if (b.charAt(0) == '\0')
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < l;i++)
			{
				System.out.printf("%c=%d\n",b.charAt(i),c[i]);
			}
		}
	}
}

