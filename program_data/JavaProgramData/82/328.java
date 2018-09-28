package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int high; //???????
		int low;
		int j = 0;
		int[] flag = new int[n]; //???????????????
		for (int k = 0;k < n;k++)
		{
			flag[k] = 0; //????????0
		}
		for (int i = 0;i < n;i++)
		{
			  high = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  low = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  if (high <= 140 && high >= 90 && low >= 60 && low <= 90)
			  {
				  flag[j]++; //????????????????????+1
			  }
			  else
			  {
				  j++; //???????????????????
			  }
		}
		int max = flag[0];
		for (int l = 0;l < n;l++)
		{
			   if (flag[l] > max)
			   {
				  max = flag[l]; //??????????????
			   }
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}

