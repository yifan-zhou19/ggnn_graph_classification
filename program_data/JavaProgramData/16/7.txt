package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[6]);
		int i;
		int n;
		int[] nnum = new int[6];
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		n = num.length();

		for (i = n - 1;i >= 0;i--)
		{
			nnum[i] = num.charAt(i) - 48;
			System.out.printf("%d",nnum[i]);
		}

		return 0;
	}


}

