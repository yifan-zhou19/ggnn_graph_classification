//****************???????????************
//****************???????*******************
//****************?????2012?12?12?*********
//****************???1200062701****************


public class c_in
{
	public int x;
	public int y;
}
public class c_out
{
	public int m;
	public int time;
}

package <missing>;

public class GlobalMembers
{
	public static c_in[] sample = tangible.Arrays.initializeWithDefaultc_inInstances(5000 * 9999);
	public static c_out[] name = tangible.Arrays.initializeWithDefaultc_outInstances(5000 * 9999);
	public static int Main()
	{
		int n;
		int i;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; ; i++)
		{
			sample[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sample[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((sample[i].x == 0) && (sample[i].y == 0))
			{
				break;
			}
		}
		for (int j = 0; j < n; j++) //???????????
		{
			name[j].m = j;
			name[j].time = 0;
		}
		for (int j = 0; j < i; j++) //??????? 0 0 ?????
		{
			(name[sample[j].y].time)++;
		}
		for (int j = 0; j < n; j++)
		{
			if (name[j].time == n - 1)
			{
				System.out.print(name[j].m);
				flag += 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

