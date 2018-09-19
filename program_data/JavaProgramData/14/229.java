/*????????
 *?????
 *???1000010549
 *???2010-12-25
 */


public class student
{
	public int num;
	public int scorec;
	public int scorem;
	public int score;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
		int[][] best =
		{
			{0, 0, 0},
			{0, 0, 0}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			stu[i].num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].scorec = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].scorem = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].score = stu[i].scorec + stu[i].scorem;
		}
		for (i = 1;i <= n;i++)
		{
			if (stu[i].score > best[1][0])
			{
				best[0][2] = best[0][1];
				best[0][1] = best[0][0];
				best[0][0] = stu[i].num;
				best[1][2] = best[1][1];
				best[1][1] = best[1][0];
				best[1][0] = stu[i].score;
			}
			else if (stu[i].score <= best[1][0] != 0 && stu[i].score> best[1][1])
			{
				best[0][2] = best[0][1];
				best[0][1] = stu[i].num;
				best[1][2] = best[1][1];
				best[1][1] = stu[i].score;
			}
			else if (stu[i].score <= best[1][1] != 0 && stu[i].score> best[1][2])
			{
				best[0][2] = stu[i].num;
				best[1][2] = stu[i].score;
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.print(best[0][i]);
			System.out.print(' ');
			System.out.print(best[1][i]);
			System.out.print("\n");
		}
		return 0;
	}

}

