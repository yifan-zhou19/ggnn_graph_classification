public class student
	{
	public int ID;
	public int yw;
	public int sx;
	}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000); //??????
	public static int Main()
	{
		int num;
		int i;
		int j;
		int[] sum = new int[100000];
		int t;
		int m;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= num;i++)
		{
			stu[i].ID = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].yw = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].sx = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum[i] = stu[i].yw + stu[i].sx;
		} //?????????
	for (i = 1;i < 4;i++)
	{
		for (j = num;j > 1;j--)
		{
			if (sum[j] > sum[j - 1])
			{
				t = sum[j - 1];
				m = stu[j - 1].ID;
				sum[j - 1] = sum[j];
				stu[j - 1].ID = stu[j].ID;
				sum[j] = t;
				stu[j].ID = m;
			}
		}
	} //????
	for (i = 1;i < 4;i++)
	{
		System.out.print(stu[i].ID);
		System.out.print(' ');
		System.out.print(sum[i]);
		System.out.print("\n");
	}
	return 0;
	} //????

}

