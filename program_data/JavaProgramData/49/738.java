package <missing>;

public class GlobalMembers
{
	public static int p;
	public static int q;
	public static int flag;
	public static String input = new String(new char[100]);
	public static int judge(int i,int l)
	{
		flag = 0;
		for (p = i;p < (l / 2 + i);p++)
		{
			   if (input.charAt(p) == input.charAt(l + 2 * i - p - 1))
			   {
					flag++;
			   }
		}
		if (flag == l / 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length = input.length();
		int k;
		int d;
		int w;
		for (d = 2;d <= length;d++)
		{
		for (k = 0;k < length - 1;k++)

		{
				   if (judge(k, d) == 1)
				   {
						   for (w = k;w < k + d;w++)
						   {
								  System.out.print(input.charAt(w));
						   }
							  System.out.print("\n");
				   }
		}
		}

	}

}

