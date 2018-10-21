public class Student
{
		public int ID;
		public int chinese;
		public int maths;
		public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(3); //????????
			Student t = new Student();
			stu[0].sum = stu[1].sum = stu[2].sum = 0; //???????0
			int i;
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < n; i++)
			{
					t.ID = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					t.chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					t.maths = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					t.sum = t.chinese + t.maths;
					// ????????????
					if (t.sum > stu[0].sum)
					{
							stu[2] = stu[1]; //????????????????
							stu[1] = stu[0];
							stu[0] = t;
					}
					else if (t.sum > stu[1].sum)
					{ //???????????
							stu[2] = stu[1]; //???????????????
							stu[1] = t;
					}
					else if (t.sum > stu[2].sum)
					{ //???????????
							stu[2] = t; //??????????
					}
			}
			//?????????????
			for (i = 0; i < 3; i++)
			{
					System.out.print(stu[i].ID);
					System.out.print(" ");
					System.out.print(stu[i].sum);
					System.out.print("\n");
			}
			return 0;
	}

}

