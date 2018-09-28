package <missing>;

public class GlobalMembers
{
	public static int[] bb = new int[1000];
	public static int Main()
	{
		int k;
		int x;
		int y;
		int z;
		int a = 0;
		int time;
		int i;
		int j;
		int[] aa = new int[2000];
		char p;
		while (true)
		{
		 time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 bb[time]++;
		 if (System.in.read() != ',')
		 {
		 break;
		 }
		}
		 i = 0;
		while (true)
		{
		 time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 bb[time]--;
		 i++;
		 if (System.in.read() != ',')
		 {
		 break;
		 }
		}
				x = 0;
		 for (j = 0;j < 999;j++)
		 {
			   a = 0;
		   for (k = 0;k <= j;k++)
		   {
				  a = a + bb[k];
		   }
			if (a > x)
			{
			x = a;
			y = j;
			}
		 }
			System.out.print(i);
			System.out.print(" ");
			System.out.print(x);
			return 0;
	}
}

