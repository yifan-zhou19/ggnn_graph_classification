package <missing>;

public class GlobalMembers
{
	/*
	 *????HW5_02.cpp
	 *??????1100019007?
	 *???2012-10-29
	 *???????????
	 */ 
	public static int[] src = new int[20000]; //???
	public static int[] dst = new int[100]; //?????
	public static int Main()
	{
	  int n; //??n,i,j
	  int i;
	  int j;
	  int flag;
	  int current_pos = 0; //dst????
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < n;i++)
	  {
		  src[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (i = 0;i < n;i++)
	  {
			if (current_pos != 0)
			{
				flag = 1;
				for (j = 0;j < current_pos;j++)
				{
					if (dst[j] == src[i])
					{
						flag = 0; //??????????flag???0
					}
				}
				if (flag == 1)
				{
					dst[current_pos] = src[i];
					current_pos++;
				}
			}
			else
			{
				dst[0] = src[0];
				current_pos++;
			}
	  }
	  for (i = 0;i < current_pos;i++)
	  {
			System.out.print(dst[i]);
			if (i < current_pos - 1)
			{
				System.out.print(" ");
			}
	  }
	  System.out.print("\n");
	  return 0; //????
	}

}

