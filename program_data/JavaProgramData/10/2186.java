package <missing>;

public class GlobalMembers
{
	public static int k; //???
	public static int[] mis = new int[30];
	public static int maxL = 0;
	public static int curH = 100000;
	public static int getNum = 0;
	public static int cmp(int a, int b) //????
	{
		 if (a > b)
		 {
			 return 0;
		 }
		 else
		 {
			 return 1;
		 }
	}


	public static void oneState(int id)
	{
		 if (id >= k)
		 {
			  if (getNum > maxL)
			  {
				  maxL = getNum;
			  }
			  return;
		 }


		if (mis[id] <= curH) //??
		{
		   int t = curH;
		   curH = mis[id];
		   getNum++;

			oneState(id + 1);

			curH = t;
			getNum--;

		}


		oneState(id + 1);

	}



	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			mis[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		oneState(0);
		System.out.print(maxL);
		System.out.print("\n");

	   return 0;
	}
}

