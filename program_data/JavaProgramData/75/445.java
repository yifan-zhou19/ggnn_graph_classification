package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[] count = new int[1001];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(count,0,(Integer.SIZE / Byte.SIZE));

			int[] come = new int[1000];
			int[] go = new int[1000];
			char m;

			int i;
			int j;
			int max;

			for (i = 0;;i++)
			{
					come[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					m = System.in.read();
					if (m == '\n')
					{
							break;
					}
			}

			for (i = 0;;i++)
			{
					go[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					m = System.in.read();
					if (m != ',')
					{
							break;
					}
			}

			int num = i + 1;


			for (i = 0;i < num;i++)
			{
					for (j = come[i];j < go[i];j++)
					{
							count[j]++;
					}
			}
			max = 0;
			for (i = 0;i <= 1000;i++)
			{
					if (count[i] > max)
					{
							max = count[i];
					}
			}

			System.out.print(num);
			System.out.print(" ");
			System.out.print(max);
			System.out.print("\n");

			return 0;
	}
}

