package <missing>;

public class GlobalMembers
{
	public static final int MAX_DIGIT = 10000;

	public static int Main()
	{
		int[] num = new int[100];
		num[0] = 1;
		num[1] = 0;
		int numDigits = 1;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; ++i)
		{
			int end = numDigits;
			for (int i = 0; i < end; ++i)
			{
				num[i] *= 2;
			}
			for (int i = 0; i < end; ++i)
			{
				if (num[i] >= MAX_DIGIT)
				{
					if (i != numDigits - 1)
					{
						num[i + 1] += num[i] / MAX_DIGIT;
					}
					else
					{
						num[numDigits] = num[i] / MAX_DIGIT;
						++numDigits;
					}
				}
				num[i] = num[i] % MAX_DIGIT;
			}
		}
		for (int i = numDigits - 1; i >= 0; --i)
		{
			if (i != numDigits - 1)
			{
//C++ TO JAVA CONVERTER TODO TASK: The cout 'setfill' manipulator is not converted by C++ to Java Converter:
//ORIGINAL LINE: cout << setfill('0') << setw(4);
			}
		   System.out.printf("%4d", num[i]);
		}
		System.out.printf("%4d", "\n");
	}

}

