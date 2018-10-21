package <missing>;

public class GlobalMembers
{
	//******************************
	//*?? ??????          **
	//*?? ??? 1100016602     **
	//*?? 2011?12?14?        **
	//****************************** 


	public static int Main()
	{
		int n; //???? a[i]????i??????b[i]??i???????
		int[] a = new int[100001];
		int[] b = new int[100001];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE)); //?????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		for (; ;) //????????i????????1???j?????+1
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((i == 0) && (j == 0))
			{
				break;
			}
			a[j]++;
			b[i]++;
		}
		for (p = (a[0]), q = (b[0]), i = 0 ; i < n ; i++) //???????????????????????0???n - 1?????????
		{
			if ((*(p + i) == n - 1) && (*(q + i) == 0))
			{
				j = i; //?i????
				break;
			}
		}
		if (j == n) //?j????n????????
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		else //??????????
		{
			System.out.print(j);
			System.out.print("\n");
		}
		return 0;
	}


}

