package <missing>;

public class GlobalMembers
{
	public static int v = 0;
	public static int r = 0;
	public static void fy()
	{
		 int a;
		 int b;
		 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		 {
		 r++;
		 }
		 else
		 {
			  if (r > v)
			  {
			  v = r;
			  }
			  r = 0;
		 }
	}
	public static int Main()
	{
		int a;
		int i;
		int b;
		int z;
		int t = 0;
		int c = 0;
		int[] d = new int[4];
		double m;
		double n = 0;
		String s = new String(new char[100]);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < b;i++)
		{
		   fy();
		}
		System.out.print((v > r != 0?v:r));
		System.out.print("\n");
		return EXIT_SUCCESS;
	}

}

