public class person
{
	public String num = new String(new char[6]);
	public int Chinese;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static person[] stu = tangible.Arrays.initializeWithDefaultpersonInstances(100000);

	public static int Main()
	{
		int n;
		int i;
		int max;
		int j;
		int k;
		int temp = 0;
		int tnum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			stu[i].num = ConsoleInput.readToWhiteSpace(true).charAt(0);
			stu[i].Chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].total = stu[i].math + stu[i].Chinese;

		}
		for (j = 0; j < 3; j++)
		{
			max = 0;
			for (i = 0; i < n; i++)
			{
				if (stu[i].total > max)
				{
					max = stu[i].total;
					k = i;
				}
			}
			System.out.print(stu[k].num);
			System.out.print(" ");
			System.out.print(stu[k].total);
			System.out.print("\n");
			stu[k].total = 0;
		}
		return 0;
	}
}

