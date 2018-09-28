package <missing>;

public class GlobalMembers
{
		public static int judge(float x)
		{
			int i;
			int m;
			int x1;
			if (x == 3F || x == 5F || x == 7F)
			{
			return (1);
			}
			else
			{
			m = (int)Math.sqrt(x);
			x1 = (int)x;
			for (i = 3;i <= (m / 2 * 2 + 1);i = i + 2)
			{
			if (x1 % i == 0)
			{
			return (0);
			}
			}
			return 1;
			}
		}
		public static int Main()
		{
			int num;
			float p;
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (p = 3F;p <= num / 2;p = p + 2)
			{
								 if (judge(p) != 0 && judge(num - p) != 0)
								 {
								 System.out.print(p);
								 System.out.print(' ');
								 System.out.print(num - p);
								 System.out.print("\n");
								 }
			}

			return 0;
		}


}

