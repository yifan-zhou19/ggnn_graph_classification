package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] nums = new int[n];

		for (int i = 0; i < n; i++)
		{
			nums[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *end;
		int end;
		p = nums;
		end = nums + n;
		while (true)
		{
			end = remove(p + 1,end,*p);
			if (p != end - 1)
			{
				System.out.print(p);
				System.out.print(',');
			}
			else
			{
				System.out.print(p);
				break;
			}
			p++;
		}
		return 0;
	}

}

