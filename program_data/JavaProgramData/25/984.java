package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[35];
	public static int[] b = new int[35];
	public static int[] c = new int[35];
	public static int[] d = new int[35];
	public static void jiaziji()
	{
		 for (int i = 34;i > 0;i--) //c????????d???????a?b?????????????
		 {
			 c[i] = a[i] + b[i] + d[i];
			 if (c[i] > 9) //????
			 {
				  c[i] -= 10;
				  d[i - 1] += 1;
			 }
		 }
		 for (int i = 0;i < 35;i++) //????????????????????a?b???d????
		 {
			 a[i] = c[i];
			 b[i] = c[i];
			 d[i] = 0;
		 }
	}
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 35;i++)
		{
			a[i] = 0;
			b[i] = 0;
			c[i] = 0;
			d[i] = 0;
		}
		a[34] = 1;
		b[34] = 1;
		for (int i = 0;i < n;i++)
		{
			jiaziji();
		}
		if (n == 0)
		{
			System.out.print('1');
			System.out.print("\n");
		}
		else //?????????????
		{
			int p = 0;
			for (int i = 0;i < 35;i++)
			{
				if (c[i] != 0)
				{
					p = i;
					break;
				}
			}
			for (int i = p;i < 35;i++)
			{
				System.out.print(c[i]);
			}
		}

		return 0;
	}

}

