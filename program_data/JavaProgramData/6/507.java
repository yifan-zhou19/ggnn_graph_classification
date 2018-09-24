package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int[][] a = new int[100][100]; //????????????????~~
		int n = 0; //????????~~
		int x = 0; //????~~
		int y = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < x;j++)
			{
				for (int k = 0;k < y;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
			int p;
			int sum = 0;
			for (int j = 1;j < x - 1;j++)
			{
				p = a[j];
				sum = p + *(p + y - 1) + sum;
			} //??????????~???????~~
			p = a[0];
			for (int j = 0;j < y;j++)
			{
				sum += p;
				p++;
			}
			p = a[x - 1];
			for (int j = 0;j < y;j++)
			{
				sum += p;
				p++;
			} //???????????????~~
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	} //?????

}

