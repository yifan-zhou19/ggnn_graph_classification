package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
	if (x % 400 == 0)
	{
		return 1;
	}
	if (x % 100 == 0 && x % 400 != 0)
	{
		return 0;
	}
	if (x % 4 == 0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
	public static int Main()
	{
		int n;
		int year;
		int month0;
		int month1;
		int mark;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		mark = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (month0 > month1)
		{
			int temp;
			temp = month0;
			month0 = month1;
			month1 = temp;
		}
		if (judge(year) == 0)
		{
		 if (month0 == 1 && month1 == 10)
		 {
			 mark = 1;
		 }
		 if (month0 == 2 && month1 == 3)
		 {
			 mark = 1;
		 }
		 if (month0 == 2 && month1 == 11)
		 {
			 mark = 1;
		 }
		 if (month0 == 3 && month1 == 11)
		 {
			 mark = 1;
		 }
		 if (month0 == 4 && month1 == 7)
		 {
			 mark = 1;
		 }
		 if (month0 == 9 && month1 == 12)
		 {
			 mark = 1;
		 }
		}
		 else
		 {
		 if (month0 == 1 && month1 == 4)
		 {
			 mark = 1;
		 }
		 if (month0 == 1 && month1 == 7)
		 {
			 mark = 1;
		 }
		 if (month0 == 2 && month1 == 8)
		 {
			 mark = 1;
		 }
		 if (month0 == 3 && month1 == 11)
		 {
			 mark = 1;
		 }
		 if (month0 == 4 && month1 == 7)
		 {
			 mark = 1;
		 }
		 if (month0 == 9 && month1 == 12)
		 {
			 mark = 1;
		 }
		 }
		 if (mark == 1)
		 {
			 System.out.print("YES");
			 System.out.print("\n");
		 }
		  else
		  {
			  System.out.print("NO");
			  System.out.print("\n");
		  }
		}
		return 0;
	}
}

