public class student
{
	public int num;
	public int chinese;
	public int math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(100001); //??????? ?? ?? ??
	public static student first = new student();
	public static student second = new student();
	public static student third = new student();

	public static int Main()
	{
		int n;
		int i;
		int temp1;
		int temp2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			s[i].num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i].chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i].sum = s[i].chinese + s[i].math; //??=?????
		}
		first.sum = 0, second.sum = 0, third.sum = 0; //???????
		for (i = 0 ; i < n ; i++)
		{
			if (first.sum < s[i].sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: first = s[i];
				first.copyFrom(s[i]);
				temp1 = i; //?????????
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			if (second.sum < s[i].sum && s[i].num != s[temp1].num) //????????????????????????????
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: second = s[i];
				second.copyFrom(s[i]);
				temp2 = i;
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			if (third.sum < s[i].sum && s[i].num != s[temp1].num && s[i].num != s[temp2].num) //?????
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: third = s[i];
				third.copyFrom(s[i]);
			}
		}
		System.out.print(first.num);
		System.out.print(" ");
		System.out.print(first.sum);
		System.out.print("\n");
		System.out.print(second.num);
		System.out.print(" ");
		System.out.print(second.sum);
		System.out.print("\n");
		System.out.print(third.num);
		System.out.print(" ");
		System.out.print(third.sum);
		System.out.print("\n");
		return 0;
	}

}

