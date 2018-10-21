package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] b = new int[3000];
		String st = new String(new char[3000]);
		st = new Scanner(System.in).nextLine();
		n = st.length();
		char c;
		int word = 0;
		int num = 0;
		if (n == 1)
		{
			System.out.print("1");
		}
		if (n >= 2)
		{
			for (i = 0;c = st.charAt(i) != '\0';i++)
			{
				if (c == ' ')
				{
					word = 0;
				}
				else if (word == 0)
				{
					word = 1;
					num++;
				}
			}

		int[] shu = new int[3000];
	  int p = 0;
	  int k = 0;
		for (i = 0;i <= n;i++)
		{
			if (st.charAt(i) == ' ')
			{
				if (st.charAt(i - 1) != ' ')
				{
					b[k] = i - p;
					p = i + 1;
					k++;
				}
				if (st.charAt(i - 1) == ' ')
				{
					p = p + 1;
				}
			}
			if (st.charAt(i) == '\0')
			{
				b[k] = i - p;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k]);
		}


	}
}
