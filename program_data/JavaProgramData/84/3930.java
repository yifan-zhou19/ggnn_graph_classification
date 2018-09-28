package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int Max;
	 int OnlyUnderMax;
	 int Min;
	 int i;
	 int n;
	 int[] nums = new int[100];
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 nums[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 Max = Min = nums[0];
	 for (i = 1;i < n;i++)
	 {
	  nums[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (nums[i] > Max)
	  {
	   Max = nums[i];
	  }
	  if (nums[i] < Min)
	  {
	   Min = nums[i];
	  }
	 }
	 OnlyUnderMax = Min;
	 for (i = 0;i < n;i++)
	 {
	  if (nums[i] > OnlyUnderMax && nums[i] < Max)
	  {
	   OnlyUnderMax = nums[i];
	  }
	 }
	 System.out.print(Max);
	 System.out.print("\n");
	 System.out.print(OnlyUnderMax);
	 System.out.print("\n");
	 return 0;
	}
}

