package <missing>;

public class GlobalMembers
{
	// *********************************
	// ****  file ??2?N??.cpp  ****
	// ****  ID:1000012895          ****
	// ****  Author ???          ****
	// ****  2010/12/15             ****
	// *********************************
	public static int Main()
	{
		int i; // num???????????????num[0]????????
		int j;
		int n;
		int[] num = new int[40];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null;
		int p = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,160); // ??num???
		num[0] = 1; // ????????????000��01?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 40; j++) // ??????
			{
				num[j] *= 2;
			}
			for (j = 0; j < 40; j++) // ????
			{

				if (num[j] > 9)
				{
					num[j + 1]++;
					num[j] -= 10;
				}
			}
		}
		p = num + 38; // ????????
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (*(--p) == 0) // ???????????????
		{
			;
		}
		while (p >= num) // ????????????????
		{
			System.out.print(p);
			p--;
		}
		System.out.print("\n");
		return 0;
	}
}

