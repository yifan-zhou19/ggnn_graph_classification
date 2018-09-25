package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int xuehao[100000];
	//		int yuwen[100000];
	//		int shuxue[100000];
	//		int zongfen[100000];
	//	}
	//	a;
		for (i = 0;i < n;i++)
		{
			a.xuehao[i] = ConsoleInput.readToWhiteSpace(true);
			a.yuwen[i] = ConsoleInput.readToWhiteSpace(true);
			a.shuxue[i] = ConsoleInput.readToWhiteSpace(true);
			a.zongfen[i] = a.shuxue[i] + a.yuwen[i];
		}
		for (i = n - 1;i >= n - 3;i--)
		{
			for (j = i;j >= 1;j--)
			{
				if (a.zongfen[j] > a.zongfen[j - 1])
				{
					temp = a.zongfen[j - 1];
					a.zongfen[j - 1] = a.zongfen[j];
					a.zongfen[j] = temp;
					temp = a.xuehao[j - 1];
					a.xuehao[j - 1] = a.xuehao[j];
					a.xuehao[j] = temp;
				}
			}
		}
		for (i = 0;i <= 2;i++)
		{
			System.out.print(a.xuehao[i]);
			System.out.print(" ");
			System.out.print(a.zongfen[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

