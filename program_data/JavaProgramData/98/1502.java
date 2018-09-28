package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i; //mun?????????
		int n;
		int mun;
		int[] b = new int[500]; //b??????????
		char[][] word = new char[500][50];
		String pi;
		pi = word[0];
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
				word[i] = tempVar2.charAt(0);
			}
			b[i] = String.valueOf(word[i]).length();
		}
		System.out.printf("%s",pi);
		mun = b[0];
		for (i = 1;i < n;i++)
		{
			pi = word[i];
			mun = mun + b[i] + 1;
			if (mun <= 80)
			{
				System.out.printf(" %s",pi);
			}
			else
			{
				System.out.printf("\n%s",pi);
				mun = b[i];
			}
		}
	}
}

