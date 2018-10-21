public class result //??result?????num?????????????
{
	public int num;
	public int chn;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		result[] student = tangible.Arrays.initializeWithDefaultresultInstances(n + 1); //?result??????student
		for (k = 1;k <= n;k++)
		{
				student[k].num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				student[k].chn = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				student[k].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			student[k].total = student[k].chn + student[k].math; //?????
		}
		int i;
		int j;
		result temp = new result();
		for (i = 1;i < 4;i++)
		{
			for (j = 1;j <= n - i;j++) //???????
			{
					if (student[j].total >= student[j + 1].total)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=student[j];
						temp.copyFrom(student[j]);
					student[j] = student[j + 1];
					student[j + 1] = temp;
					}
			}
		}
		System.out.print(student[n].num);
		System.out.print(" ");
		System.out.print(student[n].total);
		System.out.print("\n");
		System.out.print(student[n - 1].num);
		System.out.print(" ");
		System.out.print(student[n - 1].total);
		System.out.print("\n");
		System.out.print(student[n - 2].num);
		System.out.print(" ");
		System.out.print(student[n - 2].total);
		System.out.print("\n");

		return 0;
	}
}

