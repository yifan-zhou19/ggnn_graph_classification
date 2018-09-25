package <missing>;

public class GlobalMembers
{
	//************************************************************
	//*????????? ****************************************
	//*??????? 1200012979 *********************************
	//*??:2012.11.6 ********************************************
	//************************************************************
	public static int Main()
	{
		int[][] m = new int[6][6];
		int[] x1 = new int[6];
		int[] y1 = new int[6];
		int[] x2 = new int[6];
		int[] y2 = new int[6];
		int[] h = new int[6];
		int[] l = new int[6];
		int i;
		int k;
		int n;
		int j = 0;
		for (i = 1 ; i <= 5 ; i++)
		{
			for (k = 1 ; k <= 5 ; k++)
			{
				m[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1 ; i <= 5 ; i++)
		{
			h[i] = m[i][1];
			x1[i] = i;
			y1[i] = 1;
			for (k = 1 ; k <= 5 ; k++) //h[i]???????
			{

				if (m[i][k] > h[i])
				{
					h[i] = m[i][k];
					x1[i] = i; //x1?????
					y1[i] = k; //y1?????
				}
			}
		}
		for (k = 1 ; k <= 5 ; k++)
		{
			l[k] = m[1][k]; //l[k]???????
			x2[k] = 1;
			y2[k] = k;
			for (i = 2 ; i <= 5 ; i++)
			{
				if (m[i][k] < l[k])
				{
					l[k] = m[i][k];
					x2[k] = i; //??????
					y2[k] = k;
				}
			}
		}
		for (n = 1 ; n <= 5 ; n++)
		{
			if (h[n] == l[y1[n]])
			{
				if (x1[n] == x2[y1[n]])
				{
					if (y1[n] == y2[y1[n]])
					{
						System.out.print(x1[n]);
						System.out.print(" ");
						System.out.print(y1[n]);
						System.out.print(" ");
						System.out.print(h[n]);
						j++;
					}
				}
			}
		}
		if (j == 0) //j???????0?????
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

