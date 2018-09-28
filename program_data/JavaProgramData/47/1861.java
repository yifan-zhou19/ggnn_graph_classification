package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //????n
		int k = 0;
		int[] num = new int[100]; //??
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		for (k = 0;k < n;k++) //??
		{
			num[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = n - 1;
		for (k = n - 1;k > 0;k--) //????
		{
			System.out.print(num[k]);
			System.out.print(' ');
		}
		System.out.print(num[0]);
		return 0;
	}
}

