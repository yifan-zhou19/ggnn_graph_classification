package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'input', so pointers on this parameter are left unchanged:
	public static void up(char * input)
	{
		while (*input != null)
		{
			if (((*input) >= 'a') && ((*input) <= 'z'))
			{
				*input -= 32;
			}
			input = input.Substring(1);
		}
	}

	public static int Main()
	{
		final String chart = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int src = 0;
	int dst = 0;

		int i;
		int result = 0;
		String input = new String(new char[100]);
		String output = new String(new char[MAX]);
		String curr;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			src = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			input = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			dst = Integer.parseInt(tempVar3);
		}

		up(input);
		for (i = 0;input.charAt(i);i++)
		{
			if (input.charAt(i) >= 'A')
			{
				result = result * src + input.charAt(i) - 'A' + 10;
			}
			else
			{
				result = result * src + input.charAt(i) - '0';
			}
		}
		output = output.substring(0, MAX - 1);
		curr = (output.charAt(MAX - 1));
		do
		{
			curr--;
			curr = chart.charAt(result % dst);
			result /= dst;
		}while (result != 0);
		System.out.printf("%s",curr);
		return 0;
	}
}

