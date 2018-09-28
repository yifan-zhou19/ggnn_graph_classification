package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??:  ????        ** 
	//*??: ???      		    **
	//*???2011  12 09              **
	//****************************************
	public static int Main()
	{
		int a; //a,b??????????
		int b;
		int[][] c = new int[2][10001]; //??????????????????????????
		int n;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p; //????
		int flag = 0; //???????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break; //??????
			}
			else
			{
				c[0][a]++;
				c[1][b]++; //??
			}
		}
		for (p = c[0]; p < c[0] + n; p++, k++) //k?????????????????
		{
			if (p == 0 && *(p + 10001) == n - 1) //??????
			{
				System.out.print(k);
				System.out.print("\n");
				flag = 1; //?????1
			}
		}
		if (flag == 0)
		{
		System.out.print("NOT FOUND");
		System.out.print("\n");
		}
	}
}

