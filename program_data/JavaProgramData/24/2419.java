package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		int max_end;
		int max_len = 0;
		int min_end;
		int min_len = 10000;
		int l;
		int i;
		int j;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i <= l;i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == ',' || i == l)
			{
				if (k < min_len && k>0)
				{
					min_len = k;
					min_end = i;
				};
				if (k > max_len)
				{
					max_len = k;
					max_end = i;
				};
				k = 0;
			}
			else
			{
				k++;
			}
		}
		//printf("%d %d %d %d\n",max_end,max_len,min_end,min_len);
		for (i = max_end - max_len;i < max_end;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = min_end - min_len;i < min_end;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
	}

}
