package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[] x = new int[1010]; //??????
		int[] y = new int[1010];
		int i;
		int n;
		int[] high = new int[3000];
		int a;
		int b;
		int j;
		int big;
		n = 1;
		i = 2;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x[1] = a;
		while ((c = System.in.read()) == ',') //??????
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x[i] = a; //??
			i++;
			n++;
		}
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 2;i <= n;i++) //??????????
		{
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++) //???????????????????
		{
			for (j = x[i];j < y[i];j++)
			{
			   high[j]++;
			}
		}
			   big = high[1];
			for (j = 1;j <= 3000;j++) //?????
			{
			   if (high[j] > big)
			   {
				   big = high[j];
			   }
			}
			   System.out.print(n);
			   System.out.print(' ');
			   System.out.print(big);
	}




}

