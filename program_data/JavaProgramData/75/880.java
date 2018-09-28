package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i = 1;
		int j;
		int k;
		int[] num = new int[1000];
		int max = 0;
		// x????????y????????ijk??????num???????????????max?????????
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (cin.peek() != '\n')
		{
			System.in.read(); //????
			x[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < i;j++)
		{ //??i??
			System.in.read();
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
			 for (j = 0;j < i;j++)
			 {
				 for (k = x[j];k < y[j];k++)
				 {
					 num[k]++; //?????????????????????1
				 }
							//????????????????
			 }
		for (j = 0;j < 1000;j++)
		{
			if (num[j] > max)
			{
				max = num[j];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		 return 0;
	}


}

