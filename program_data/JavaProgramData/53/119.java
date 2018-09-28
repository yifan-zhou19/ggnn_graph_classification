package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		int i;
		int num = 0;
		int[] b = new int[300];
		int j;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p1 = a;
		p2 = b;
		b[num] = p1;
		num++;
		for (i = 0;i < n;i++)
		{
			flag = 0;
			for (j = 0;j < num;j++)
			{
				if (*(p1 + i) == *(p2 + j))
				{
			flag = 1;
				}
			}
			if (flag == 0)
			{
			*(p2 + num) = *(p1 + i);
				num++;
			}
		}
		for (i = 0;i < num;i++)
		{
			if (i == num - 1)
			{
				System.out.print((p2 + i));
				System.out.print("\n");
			}
			else
			{
				System.out.print((p2 + i));
				System.out.print(",");
			}
		}
		return 0;
	}

}

