package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int on = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] input_array = new int[n];
		int[] output_array = new int[100];
		int[] otn_array = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(output_array,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < n;i++)
		{
			input_array[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			int otn = input_array[i];
			if (output_array[otn - 1] == 0)
			{
				output_array[otn - 1] = 1;
				otn_array[on] = otn;
				on++;
			}
		}
		for (int i = 0;i < on;i++)
		{
			System.out.print(otn_array[i]);
			if (i != on - 1)
			{
				System.out.print(' ');
			}
		}
		return 0;
	}
}

