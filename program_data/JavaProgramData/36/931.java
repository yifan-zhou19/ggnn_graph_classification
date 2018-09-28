package <missing>;

public class GlobalMembers
{
	/*
	2011 01 07 ??
	
	????????????????????????????????????????
	????
	???????????????????????????
	????
	???????????????????�YES�? 
	????�NO�???YES?NO???????
	
	?? 1000012760
	*/


	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int la = 0;
		int lb = 0;
		int same = 1;
		int i = 0;
		int j = 0;
		int[] aused = new int[100];
		int[] bused = new int[100];

		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);

		la = a.length();
		lb = b.length();

		if (la != lb)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			for (i = 0; i < la; i++)
			{
				for (j = 0; j < lb; j++)
				{
					if (a.charAt(i) == b.charAt(j) && bused[j] == 0)
					{
						bused[j] = 1;
						aused[i] = 1;
						break;
					}
				}
				if (aused[i] == 0)
				{
					System.out.print("NO");
					System.out.print("\n");
					return 0;
				}
			}
			for (i = 0; i < lb; i++)
			{
				if (bused[i] == 0)
				{
					System.out.print("NO");
					System.out.print("\n");
					return 0;
				}
			}
			System.out.print("YES");
			System.out.print("\n");
		}
		return 0;
	}
}

