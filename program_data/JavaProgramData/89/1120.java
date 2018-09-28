package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***?????????***
	//***??????***
	//***???2012.12.14***
	//*************************************************
	public static int Main()
	{
		int n; //a[i]????????i;flag_a[i]??i??????
		int[] a = new int[10000];
		int[] flag_a = new int[10000];
		int x;
		int y;
		int i;
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE)); //???????0
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag_a,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != 0 || y != 0)
		{
			flag_a[x] = 1; //??????????1
			if (flag_a[y] != 1)
			{
				a[y]++; //?????????????1
			}
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++) //???????????????????????
		{
			if (flag_a[i] == 0 && a[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0) //??????"NOT FOUND"
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

