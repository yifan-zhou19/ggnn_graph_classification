public class student
{
	public int ID;
	public int chinese;
	public int math;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(4);
	public static student temp = new student();
	public static int Main()
	{
		int n;
		int cnt = 3;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 3;i++)
		{
		  st[i].ID = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  st[i].chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  st[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  st[i].total = st[i].chinese + st[i].math;
		}
		do
		{
			st[3].ID = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			st[3].chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			st[3].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			st[3].total = st[3].chinese + st[3].math;
			cnt++;
			 for (int i = 1;i < 4;i++)
			 {
				 for (int j = 0;j < 4 - i;j++)
				 {
				 if (st[j + 1].total > st[j].total)
				 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=st[j];
					 temp.copyFrom(st[j]);
					 st[j] = st[j + 1];
					 st[j + 1] = temp;
				 }
				 }
			 }
		}while (cnt < n);
		for (int i = 0;i < 3;i++)
		{
			System.out.print(st[i].ID);
			System.out.print(" ");
			System.out.print(st[i].total);
			System.out.print("\n");
		}
		return 0;
	}

}

