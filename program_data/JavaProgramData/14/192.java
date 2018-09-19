/*
 * ???: 1000010191_38_1.cpp
 * ??: ???
 * ????: 2010-12-31
 * ??: ????????
 */


public class student //??
{
	public int id; //??
	public int x; //???????
	public int y;
	public int s; //??
}

package <missing>;

public class GlobalMembers
{
	public static student[] d = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
	public static student t = new student();

	public static int Main()
	{
		//????
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			d[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			//???
			d[i].s = d[i].x + d[i].y;
		}
		//??
		for (int i = 1;i <= 3;i++)
		{
			for (int j = 1;j <= n - i;j++)
			{
				if (d[j].s >= d[j + 1].s)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=d[j];
					t.copyFrom(d[j]);
					d[j] = d[j + 1];
					d[j + 1] = t;
				}
			}
		}
		//????
		for (int i = n;i >= n - 2;i--)
		{
			System.out.print(d[i].id);
			System.out.print(' ');
			System.out.print(d[i].s);
			System.out.print("\n");
		}
		return 0;
	}

}

