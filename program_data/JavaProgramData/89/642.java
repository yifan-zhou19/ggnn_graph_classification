package <missing>;

public class GlobalMembers
{
	//********************************************
	//???????????
	//??????
	//?????2010.12.10
	//???????????
	//********************************************
	public static int Main()
	{
		//??????????????????????????????????count1????????????count2
		int n;
		int[] a = new int[2];
		int i;
		int num = 0;
		int[] count1 = new int[10000];
		int[] count2 = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == 0 && a[1] == 0)
			{
				break; //??0 0 ?????
			}
			count1[a[0]]++;
			count2[a[1]]++;
		}while (1 != 0);
		for (i = 0; i < n; i++)
		{
			if (count1[i] == 0 && count2[i] == (n - 1))
			{
				System.out.print(i);
				System.out.print("\n");
				num++; //???????1
			}
		}
		if (num == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

