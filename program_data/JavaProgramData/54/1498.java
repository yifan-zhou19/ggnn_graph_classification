package <missing>;

public class GlobalMembers
{
	public static int pg(int x,int y)
	{
	 int[] an = new int[1000];
	 int i;
	 int j;
	 an[x] = y;
	 do
	 {
	   an[x] = an[x] + x;
	   for (i = x - 1;i > 0;i--)
	   {
		if (an[i + 1] % (x - 1) != 0)
		{
			break;
		}
		else
		{
			an[i] = an[i + 1] / (x - 1) * x + y;
		}
	   }
	 }while (i > 0);
	 return (an[1]);
	}
	public static int Main()
	{
	 int n;
	 int k;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.out.print(pg(n, k));
	 return 0;
	}
}

