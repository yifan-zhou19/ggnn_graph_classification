package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int w;
		int sum;
		int flag;
		int k;
		int x;
		int t = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   while (t < n)
	   {
			w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			flag = 0;
			for (j = 0;j < w;j++)
			{
			   sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (flag != -1 && (sum + 3 * (j + 1)) > 59)
				{
					flag = 1;
					break;
				}
			}
			for (k = j + 1;k < w;k++)
			{
				x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (flag != 0 && (sum <= 60) && ((sum + 3 * j) <= 60))
			{
			   System.out.print(sum);
			   System.out.print("\n");
			}
			else
			{
				System.out.print(60 - j * 3);
				System.out.print("\n");
			}
			t++;
	   };

		return 0;
	}
}

