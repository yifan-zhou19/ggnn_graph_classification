package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[900]);
		a = new Scanner(System.in).nextLine();
		a += " "; //?????????
		int m = 0;
		int[] c = new int[50];
		int[] b = new int[50];
		int n = 0;
		int i;
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == ' ')
			{ //???????????????????c?????b
			   c[n] = i - m;
			   b[n] = i;
			   m = i;
			   n++;
			}
		}
		int x;
		int y;
		x = 0;
		y = 0;
		for (i = 0;i < n;i++)
		{
			if (c[i] <= c[x])
			{ //?????????????? ?????
				x = i;
			}
			if (c[i] >= c[y])
			{
				y = i;
			}
		}
		if (y == 0)
		{
	for (i = 0;i < b[y];i++)
	{
		System.out.printf("%c",a.charAt(i));
	} //???????c?b????????
		}
	else
	{
			for (i = b[y] - c[y] + 1;i < b[y];i++)
			{ //??????
			System.out.printf("%c",a.charAt(i)); //????????????????????????????
			}
	} //??????
	System.out.print("\n");
	if (x == 0)
	{
				 for (i = 0;i < b[x];i++)
				 {
					 System.out.printf("%c",a.charAt(i));
				 }

	}
			 else
			 {
			for (i = b[x] - c[x] + 1;i < b[x];i++)
			{
			System.out.printf("%c",a.charAt(i));
			}
			 }
		return 0;
	}

}
