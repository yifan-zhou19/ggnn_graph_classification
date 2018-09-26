package <missing>;

public class GlobalMembers
{
	public static int abs(int x)
	{
		if (x < 0)
		{
			x = -x;
		}
	  else
	  {
		  x = x;
	  }
	  return (x);
	}
	public static int Main()
	{
		int n;
		int year;
		int a;
		int b;
		int i;
		int j;
		int e;
		int[] c = new int[13];
		int[] d = new int[13];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c[0] = 0;
		c[1] = c[3] = c[5] = c[7] = c[8] = c[10] = c[12] = 31;
		c[4] = c[6] = c[9] = c[11] = 30;
		for (i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		 {
			 c[2] = 29;
		 }
		 else
		 {
			 c[2] = 28;
		 }
			 for (j = 0;j < 13;j++)
			 {
				sum += c[j];
			 d[j] = sum;
			 }
			 e = abs(d[a - 1] - d[b - 1]);
		 if (e % 7 == 0)
		 {
			 System.out.print("YES");
			 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print("NO");
			 System.out.print("\n");
		 }
		}
		return 0;
	}

}

