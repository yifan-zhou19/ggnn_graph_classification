package <missing>;

public class GlobalMembers
{
	//***************************************************************************
	//* ????????			  									        *
	//* ???	????????????????????????????????*
	//*??? ???												        	*
	//*???2010?12?8?														*
	//***************************************************************************
	public static int Main()
	{
		void move(int *, int, int); //??????????????
		int[] number = new int[20];
		int n;
		int m;
		int i;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	tangible.RefObject<Integer> tempRef_number = new tangible.RefObject<Integer>(number);
		move(tempRef_number, n, m);
		number = tempRef_number.argValue;
		System.out.print("\n");
		return 0;
	}
	public static void move(tangible.RefObject<Integer> array, int n, int m)
	{
		if (m == 0) //??m??0?????????????
		{
			for (int i = 0; i < n - 1; i++)
			{
			System.out.print((array.argValue + i));
			System.out.print(' ');
			}
			System.out.print((array.argValue + n - 1));
			System.out.print("\n");
			return;
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p; //???????????p???????array_end???????????????
		int array_end;
		array_end =  (array.argValue + n - 1);
		for (p = array.argValue + n - 1; p > array.argValue; p--) //????????????????
		{
		 * p =  (p - 1);
		}
		 array.argValue = array_end; //???????????????????????
			move(array, n, m - 1); //?????m - 1?
		}

	}


}

