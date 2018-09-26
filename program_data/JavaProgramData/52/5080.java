package <missing>;

public class GlobalMembers
{
	//***************?????????****************
	//***************???????********************
	//***************?????2012?12?6?***********
	//***************???1200062701*****************

	public static int Main()
	{
		int a;
		int b;
		int x;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = a;
		int[] n = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] p = n;
		for (int i = b; i < a + b; i++)
		{
			p[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (int j = a; j < a + b; j++)
		{
			int s;
			s = p[j - a];
			p[j - a] = (p + j);
			p[j] = s;
		}
		for (int k = 0; k < a; k++)
		{
			if (p[k] != -1)
			{
				System.out.print((p + k));
				x--;
				if (x > 0)
				{
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

