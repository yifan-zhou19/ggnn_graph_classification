package <missing>;

public class GlobalMembers
{
	public static int compare(Object p1, Object p2)
	{
		return ((int)p2 - (int)p1);
	}

	public static int g(int a,int b)
	{
		if (a > b)
		{
		return 200;
		}
		else if (a == b)
		{
		return 0;
		}
		else
		{
		  return -200;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] tian = new int[1000];
		int[] qi = new int[1000];
		int[][] re = new int[1001][1001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			if (n == 1)
			{
				tian[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				qi[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				System.out.print(g(tian[0], qi[0]));
				System.out.print("\n");
			}
			else
			{
			//int *tian=new int[n];
			//int *qi=new int[n];
			for (i = 0;i < n;i++)
			{
			   tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
			   qi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tian,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(qi,n,(Integer.SIZE / Byte.SIZE),compare);

		   // for(i=0;i<n;i++)
			 // cout<<tian[i]<<" "<<qi[i]<<endl;

		   // int** re=new int*[n+1];
		   // for(i=0;i<n+1;i++)
			 //   re[i]=new int[n+1];

			re[1][0] = g(tian[n - 1], qi[0]);
			re[1][1] = g(tian[0], qi[0]);
			for (i = 2;i < n + 1;i++)
			{
				re[i][0] = re[i - 1][0] + g(tian[n - i], qi[i - 1]);
				for (j = 1;j < i;j++)
				{
					if (re[i - 1][j - 1] + g(tian[j - 1], qi[i - 1]) > re[i - 1][j] + g(tian[n - i + j], qi[i - 1]))
					{
						re[i][j] = re[i - 1][j - 1] + g(tian[j - 1], qi[i - 1]);
					}
					else
					{
						re[i][j] = re[i - 1][j] + g(tian[n - i + j], qi[i - 1]);
					}
				}
				re[i][i] = re[i - 1][j - 1] + g(tian[i - 1], qi[i - 1]);
			}

		   /* for(i=1;i<n+1;i++)
		     for(j=0;j<i+1;j++)
		       cout<<re[i][j]<<" ";
		       cout<<endl;*/

			for (i = 1;i < n + 1;i++)
			{
				if (re[n][i] > re[n][0])
				{
				  re[n][0] = re[n][i];
				}
			}
			System.out.print(re[n][0]);
			System.out.print("\n");
			//delete []tian;
			//delete []qi;
			//for(i=0;i<n+1;i++)
			//delete []re[i];
			//delete []re;
			}
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}

}

