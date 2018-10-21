package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int[] s = new int[100];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		j = n;
		while (j > 1)
		{
			 System.out.printf("%d ",s[j]);
			 j--;
		}
		System.out.printf("%d",s[1]);
		return 0;
	}

}

