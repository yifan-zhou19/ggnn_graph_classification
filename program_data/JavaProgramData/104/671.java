package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t1 = x;
		int t2 = y;
		int[] xx = new int[12];
		int[] yy = new int[12];
		int k = 0;
		int kk = 0;
		while (x > 0)
		{
				  xx[k++] = x;
				  x = x / 2;
		}
		while (y > 0)
		{
				  yy[kk++] = y;
				  y = y / 2;
		}
		int ans = 0;
		for (int i = 0;i < k;i++)
		{
				for (int j = 0;j < kk;j++)
				{
				 if (xx[i] == yy[j])
				 {
				  ans = xx[i];
				 }
				}
				  if (ans != 0)
				  {
				  break;
				  }
		}
		if (t1 == t2)
		{
			ans = t1;
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}



}

