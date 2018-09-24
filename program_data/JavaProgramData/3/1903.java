package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int i = 0;
		int j = 0;
		int biaozhi = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //????
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
				   System.out.print("yes");
				   biaozhi = 1;
				   break;
				}
			}
			if (biaozhi == 1)
			{
				  break;
			} //?????????????yes?????
		}
		if (biaozhi != 1)
		{
			   System.out.print("no");
		} //????????no

		return 0;
	}

}

