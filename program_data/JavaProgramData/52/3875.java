package <missing>;

public class GlobalMembers
{
	public static void shift(tangible.RefObject<Integer> pta, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null; //????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;
		int temp;
		p = pta.argValue;
		q = pta.argValue + n;
		while (p < q)
		{ //???????
			  temp = p;
			  *p = q;
			  *q = temp;
			  p++;
			  q--;
		}
	}
	public static int Main() //?????
	{
		int m;
		int n;
		int i;
		int[] a = new int[100]; //???????
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pta=null;
		int pta = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{ //???????
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		pta = a; //??????a??????
		  tangible.RefObject<Integer> tempRef_pta = new tangible.RefObject<Integer>(pta);
			  shift(tempRef_pta, n); //??shift????????????
			  pta = tempRef_pta.argValue;
	tangible.RefObject<Integer> tempRef_pta2 = new tangible.RefObject<Integer>(pta);
		shift(tempRef_pta2, m); //??m?????
		pta = tempRef_pta2.argValue;
		shift(pta + m, n - m); //??n-m?????
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(pta[i]);
			System.out.print(" ");
		}
			System.out.print(pta[i]);

		return 0;
	}




}

