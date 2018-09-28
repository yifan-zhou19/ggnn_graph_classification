package <missing>;

public class GlobalMembers
{
	//******************
	//???5         **
	//??????    **
	//???2013.10.31**
	//******************
	public static int Main()
	{
		int[] come = new int[2000];
		int leave;
		int num = 1;
		int max;
		int[] c = new int[2000];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Integer.SIZE / Byte.SIZE));

		char ch;

		for (int i = 0; ; i++)
		{
			come[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			ch = System.in.read();

			if (ch == '\n')
			{

				break;
			}

			num++;
		}
		for (int i = 0; i < num; i++)
		{
			leave = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			ch = System.in.read();

			for (int j = come[i]; j < leave; j++)
			{

				c[j]++;
			}
		}
		max = c[0];

		for (int i = 0; i < 1003; i++)
		{

			if (max < c[i])
			{

				max = c[i];
			}
		}

		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}

}

