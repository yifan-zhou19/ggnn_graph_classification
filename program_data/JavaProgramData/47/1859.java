package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * ar;
		int ar;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		if ((ar = (int) malloc(N * (Integer.SIZE / Byte.SIZE))) == null)
		{
			perror("error...");
			System.exit(1);
		}
		for (int i = 0;i < N;i++)
		{
			*(ar + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0;i < N;i++)
		{
			System.out.print((ar + N - i - 1));
			if (i != N - 1)
			{
				System.out.print(' ');
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(ar);
		ar = null;
		return 0;
	}

}

