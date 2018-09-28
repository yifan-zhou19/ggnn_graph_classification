package <missing>;

public class GlobalMembers
{
	//****************************************************
	//*  ? ? ?: homework.cpp                          *
	//*  ?    ?: ???                                *
	//*  ????: 2012?12?10?                        *
	//*  ????: ??????                          *
	//****************************************************


	public static int Main()
	{
		int[] a = new int[10000]; //??????
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//?? 
		while ((i != 0) || (j != 0))
		{
			a[i] = -1; //???????????????
			a[j]++; //?????????+1
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] == n - 1) //??????N - 1???????
			{
				System.out.print(i);
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("NOT FOUND");
		System.out.print("\n");
		return 0;
	}

}

