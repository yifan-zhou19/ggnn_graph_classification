package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] name = new int[300];
		int j;
		int m;
		int k = 1;
		int t = 0;
		int[] count = new int[300];
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
				name[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d,",name[0]);
		for (m = 1;m < n;m++)
		{
			 for (j = m - 1;j >= 0;j--)
			 {
				 if (name[m] == name[j])
				 {
					k = 0;
					break;
				 }
				 else
				 {
					 k++;
				 }
			 }
			 if (k != 0)
			 {
				 count[t] = name[m];
				 t++;
			 }
			 k = 1;
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%d,",count[i]);
		}
		System.out.printf("%d",count[t - 1]);
		return 0;
	}
}

