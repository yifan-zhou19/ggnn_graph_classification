package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int reverse = int num;
		int[] a = new int[6];
		for (j = 0;j < 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[j] = Integer.parseInt(tempVar);
			}
		}
		for (j = 0;j < 6;j++)
		{
			System.out.printf("%d\n",reverse(a[j])); //??
		}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();

	}
	public static int reverse(int num)
	{
		int i;
		int k;
		int b = 0;
		int m = 1;
		int jud = 0;
		int c = -1;
		int[] s = new int[100];
		if (num < 0)
		{
			num = -num;
			jud++; //jud????
		}


			 for (i = 0;num > 0;i++)
			 {
				s[i] = num % 10; //????????????? s ?
				num = num / 10;
				c++;
			 }
			for (i = 0;i <= c;i++)
			{
				for (k = 0;k < c - i;k++)
				{
					m = m * 10;
				}
				b = b + s[i] * m; //???????
				m = 1;
			}
			for (i = 0;i < 100;i++)
			{
			s[i] = 0;
			}

			if (jud != 0)
			{
				b = 0 - b;

			}

		return (b);
	}

}

