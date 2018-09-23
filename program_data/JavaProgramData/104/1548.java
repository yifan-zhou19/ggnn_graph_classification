package <missing>;

public class GlobalMembers
{
	public static void divide(int t, int[] s, int q)
	{
	  int i3 = 1;
	  for (;t > 1;i3++)
	  {
		 s[i3] = t;
		 t = t / 2;
	  }
	  s[i3] = t;
	}
	public static int Main()
	{
		int a;
		int b;
		int j;
		int k;
		int[] x = {-1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] y = {-2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		divide(a, x, 20);
		divide(b, y, 20);
		for (int i1 = 1;i1 < 20;i1++)
		{
			if (x[i1] == 1)
			{
			j = i1;
			break;
			}
		}
	   //cout<<j<<endl;
		for (int i2 = 1;i2 < 20;i2++)
		{
			if (y[i2] == 1)
			{
			k = i2;
			break;
			}
		}
		//cout<<k<<endl;
		int p;
		for (p = 0;;p++)
		{
			if (x[j - p] != y[k - p])
			{
			break;
			}
			//cout<<p<<endl;
		}
	   // cout<<p<<endl;
	   // cout<<j-p+1<<endl;
		System.out.print(x[j - p + 1]);
		System.out.print("\n");
		;
		return 0;
	}

}

