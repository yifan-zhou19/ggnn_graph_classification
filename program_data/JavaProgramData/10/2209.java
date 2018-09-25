package <missing>;

public class GlobalMembers
{
	public static int[] rec = new int[30];
	public static int[] height = new int[30];
	public static int maxV;
	public static int Main()
	{
	 int n;
	 maxV = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 if (n == 0)
	 {
		 System.out.print(0);
		 System.out.print("\n");
		 return 0;
	 }
	 int i;
	 int j;
	 for (i = 0;i < n;i++)
	 {
		 height[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 rec[i] = 1;
		 for (j = 0;j < i;j++)
		 {
				if (height[j] >= height[i] != 0 && rec[j] + 1 > rec[i])
				{
					rec[i] = rec[j] + 1;
				}
		 }
			if (rec[i] > maxV)
			{
				maxV = rec[i];
			}
	 }
	 System.out.print(maxV);
	 System.out.print("\n");
	 return 0;
	}
}

