package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???n???i
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float s_all; //strandard
		float s_good;
		s_all = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		s_good = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		float all; //?????????
		float good;
		for (i = 1;i <= n - 1;i++)
		{
			all = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			good = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (s_good / s_all - good / all > 0.05F) //????~
			{
			   System.out.print("worse");
			   System.out.print("\n");
			}
			else if (good / all - s_good / s_all > 0.05F)
			{
			   System.out.print("better");
			   System.out.print('\n');
			}
			else
			{
			   System.out.print("same");
			   System.out.print('\n');
			}
		}
		return 0; //?? (>w<)
	}

}

