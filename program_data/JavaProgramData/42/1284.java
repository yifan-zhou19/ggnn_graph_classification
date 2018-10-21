package <missing>;

public class GlobalMembers
{
	/*
	 *????HW5_01.cpp
	 *??????1100019007?
	 *???2012-10-28
	 *??????????? 
	 */ 
	public static int[] arr = new int[100000]; //???
	public static int Main()
	{
	  int n; //??n,i
	  int i;
	  int current_pos = 0; //????
	  int what_to_delect; //?????
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < n;i++)
	  {
		  arr[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  what_to_delect = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < n;i++)
	  {
			if (arr[i] != what_to_delect) //??????
			{
				arr[current_pos] = arr[i]; //???????????
				current_pos++;
			}
	  }
	  for (i = 0;i < current_pos - 1;i++)
	  {
			System.out.print(arr[i]);
			System.out.print(" ");
	  }
		System.out.print(arr[current_pos - 1]);
		System.out.print("\n");
	  return 0; //????
	}

}

