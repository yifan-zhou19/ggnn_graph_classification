package <missing>;

public class GlobalMembers
{
	public static int[] in = new int[100000];
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int count = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	restart:
	for (i = 0;i < n;i++)
	{
		if (in[i] == k)
		{
			count++;
			for (j = i;j < n - 1;j++)
			{
				in[j] = in[j + 1];
			}
			in[n - 1] = k - 1;

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto restart;
		}
	}

	System.out.print(in[0]);
	for (i = 1;i < n - count;i++)
	{
		System.out.print(" ");
		System.out.print(in[i]);
	}
	   System.in.read();
	   System.in.read();
	   System.in.read();


		return 0;
	}

}

