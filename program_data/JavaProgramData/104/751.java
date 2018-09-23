package <missing>;

public class GlobalMembers
{
	 public static void line(int a, int[] x, int num)
	 {
		x[num] = a;
		num++;
		if (a == 1)
		{
			return;
		}
		else
		{
		if (a % 2 == 0)
		{
			line(a / 2, x, num);
		}
		else
		{
			line((a - 1) / 2, x, num);





		}
		}
	 }



	public static int Main()
	{



		int[] x = new int[101];
		int[] y = new int[101];
		int i;
		int j;
		int k;
		int flag = 0;
		int a;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(x,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y,0,(Integer.SIZE / Byte.SIZE));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		line(a, x, 1);
		line(b, y, 1);
		for (i = 1;x[i] != 0;i++)
		{
			for (j = 1;y[j] != 0;j++)
			{
				if (x[i] == y[j])
				{
					System.out.print(x[i]);
					System.out.print("\n");
					flag = 1;
					break;
				}
				if (flag == 1)
				{
					break;
				}
			}
		}





















		return 0;

	}


}

