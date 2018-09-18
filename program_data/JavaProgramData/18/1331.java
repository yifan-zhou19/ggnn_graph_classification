package <missing>;

public class GlobalMembers
{
	/*
	 * juzhenguiling.cpp
	 *
	 *  Created on: 2012-11-26
	 *      Author: 12198
	 */
	public static int n;
	public static int[][] a = new int[201][201];
	public static int i;
	public static int j;
	public static int sum;
	public static int[] min1 = new int[201];
	public static int[] min2 = new int[201];
	public static void read()
	{
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	}
	public static void del(int n)
	{
		for (i = 0;i < n;i++)
		{
				min1[i] = a[i][0];
				for (j = 0;j < n;j++)
				{
					if (a[i][j] < min1[i])
					{
						min1[i] = a[i][j];
					}
				}
				//cout<<min1[i]<<"min1"<<endl;
		}
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{
					a[i][j] = a[i][j] - min1[i];
				}
		}
		/*for(i=0;i<n;i++)
					{for(j=0;j<n;j++)
						cout<<a[i][j]<<" ";
			            cout<<endl;}*/
		for (i = 0;i < n;i++)
		{
					min2[i] = a[0][i];
					for (j = 0;j < n;j++)
					{
						if (a[j][i] < min2[i])
						{
							min2[i] = a[j][i];
						}
					}
					//cout<<min2[i]<<"min2"<<endl;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			   a[j][i] = a[j][i] - min2[i];
			}
		}
		/*for(i=0;i<n;i++)
				{for(j=0;j<n;j++)
					cout<<a[i][j]<<" ";
		            cout<<endl;}*/
	}
	public static void move(int n)
	{
		for (i = 2;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i - 1][j] = a[i][j];
			}
		}
		for (i = 0;i < n;i++)
		{
				for (j = 2;j < n;j++)
				{
					a[i][j - 1] = a[i][j];
				}
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < n ; ++i)
		{
			read();
			sum = 0;
			for (j = 0; j < n - 1 ;++j)
			{

				   del(n - j); //?n-j+1??????
				   sum = sum + a[1][1]; //??
				   move(n - j); //?????????
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

