package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i = 0;
		int k;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: long unsigned x[100]={0},y=0;
		int[] x = new int[100];
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		k = System.in.read();
		while ((k = System.in.read()) != ' ')
		{
			if (k >= 'A' && k <= 'Z')
			{
				k = k - 55;
			}
			if (k >= 'a' && k <= 'z')
			{
				k = k - 55 - 32;
			}
			if (k >= '0' && k <= '9')
			{
				k = k - 48;
			}
			y = y * a + k;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		i = 0;
		if (y == 0)
		{
			System.out.print("0");
		}
		while (y > 0)
		{
			x[i] = y % b;
			y = y / b;
			i++;
		}

		for (i--;i >= 0;i--)
		{
			if (x[i] < 10)
			{
				System.out.printf("%d",x[i]);
			}
		else
		{
			System.out.printf("%c",x[i] + 55);
		}
		}
	}
}

