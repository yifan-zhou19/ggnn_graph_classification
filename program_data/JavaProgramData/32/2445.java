package <missing>;

public class GlobalMembers
{
	public static void f(int[] aa, int[] bb, int[] c, int t)
	{
		int i;

		for (i = 100;i >= 101 - t;i--)
		{
		 c[i] = aa[i] - bb[i];
		}

		for (i = 100;i >= 101 - t;i--)
		{
		 if (c[i] < 0)
		 {
			  c[i] = c[i] + 10;
		   c[i - 1]--;
		 }
		}

		 return;
	}


	public static int[][] d = new int[20][101];
	public static int Main()
	{
		int i;
		int n;
		int lens1;
		int lens2;
		int r = 0;
		int h = 0;
		int w1;
		int w2;
		int[] t = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String a = new String(new char[101]);
			String b = new String(new char[101]);
			int[] aa = new int[101];
			int[] bb = new int[101];
			int[] c = new int[101];
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = tempVar3.charAt(0);
		  }
		  lens1 = a.length();
		  lens2 = b.length();
		  t[i] = (lens1 > lens2)?lens1:lens2;

		  for (r = 0;r < a.length();r++)
		  {
			  aa[r + 101 - a.length()] = a.charAt(r) - '0';
		  }
		  for (r = 0;r < b.length();r++)
		  {
			  bb[r + 101 - b.length()] = b.charAt(r) - '0';
		  }
		  for (r = 101 - t[i];r < 101 - t[i] + (lens1 - lens2);r++)
		  {
			  bb[r] = 0;
		  }


		  f(aa, bb, c, t[i]);

		  for (r = 100;r >= 101 - t[i];r--)
		  {
			  d[h][r] = c[r];
		  }
		  h++;

		  System.out.print("\n");
		}

		for (r = 0;r < h;r++)
		{
			for (w1 = 101 - t[r];w1 <= 100;w1++)
			{
				if (w1 != 0)
				{
				break;
				}
			}

			for (w2 = w1;w2 <= 100;w2++)
			{
				System.out.printf("%d",d[r][w2]);
			}
				System.out.print("\n");
		}
		System.out.print("\n");

	}
}

