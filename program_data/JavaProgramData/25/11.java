package <missing>;

public class GlobalMembers
{
	//********************************************
	//* file : 1000012912_002.cpp                *
	//* author : ???                          *
	//* data : 2010.12.15                        *
	//* function : ??2?N??                  *
	//********************************************
	public static int Main()
	{
		int n; //ans???????100?
		int i;
		int j;
		int[] ans = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ans,0,(Integer.SIZE / Byte.SIZE)); //??????1
		ans[0] = 1;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				ans[j] = ans[j] * 2; //???2
			}
			for (j = 0; j < n; j++)
			{
				if (ans[j] >= 10)
				{
					ans[j + 1] += ans[j] / 10; //??
					ans[j] %= 10;
				}
			}
		}
		while (ans[i] == 0)
		{
			i--;
		}
		for (; i >= 0; i--)
		{
			System.out.print(ans[i]);
		}
		System.out.print("\n");
		return 0;
	}


}

