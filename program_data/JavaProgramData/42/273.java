package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012853_3
	* @author 1000012853 ??
	* @date 2010.10.30
	* @desc ???????
	*/
	public static int Main()
	{
		int k; //????
		int n;
		int num;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int count = 0;
		for (int s = 0; s < n; s++)
		{
			if (a[s] == k) //????????????
			{
				count++;
				for (int j = s; j < n; j++)
				{
					a[j] = a[j + 1];
				}
				s--; //?????????
			}
		}
		num = n - count;
		System.out.print(a[0]);
		for (int l = 1; l < num; l++) //????
		{
			System.out.print(' ');
			System.out.print(a[l]);
		}
		return 0;
	} //?????
}

