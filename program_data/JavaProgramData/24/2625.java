package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] len = new int[200];
		int max;
		int maxi;
		int min;
		int mini;
		char[][] w = new char[200][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(w + i) = tempVar2;
			}
			len[i] = String.valueOf(*(w + i)).length();

			//max,min//
			if (i == 0)
			{
				max = min = len[i];
				maxi = mini = i;
			}
			else
			{
				if (len[i] > max)
				{
					max = len[i];
					maxi = i;
				}
				if (len[i] < min)
				{
					min = len[i];
					mini = i;
				}
			}
		}
		//put//
		System.out.println(*(w + maxi));
		System.out.println(*(w + mini));
	}
}

