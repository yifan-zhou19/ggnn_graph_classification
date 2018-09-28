package <missing>;

public class GlobalMembers
{
	/*
	 *???: reverse_array.cpp
	 *??: ???
	 *????: 2012-12-09
	 *??: ????
	 */



	public static int Main()
	{
		int n;
		int[] array = new int[MAXN];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * begin; //??????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * end;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			array[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		begin = array;
		end = array + n - 1;
		while (begin < end)
		{
			int tmp = begin;
			*begin = end;
			*end = tmp;
			begin++;
			end--;
		}
		for (int i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.print(' ');
			}
			System.out.print(array[i]);
		}
		System.out.print("\n");
		return 0;
	}


}

