package <missing>;

public class GlobalMembers
{
	public static int[] inDegree = new int[10000];
	public static int[] outDegree = new int[10000];

	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(inDegree,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(outDegree,0,(Integer.SIZE / Byte.SIZE));
		int first;
		int second;
		while ((first = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (second = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (first == 0 && second == 0)
			{
				break;
			}
			outDegree[first]++;
			inDegree[second]++;
		}
		int i;
		for (i = 0;i < N;i++)
		{
			if (outDegree[i] == 0 && inDegree[i] == N - 1)
			{
				break;
			}
		}
		if (i == N)
		{
			System.out.print("NOT FOUND\n");
		}
		else
		{
			System.out.print(i);
			System.out.print("\n");
		}
		return 0;
	}

}

