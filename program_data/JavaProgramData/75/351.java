package <missing>;

public class GlobalMembers
{
	//
	//	????:	?????
	//	????:	?????????????????????????????????????
	//	????:	?  ? ( ? ? : 1000012733 ) 
	//	????:	2010 ? 12 ? 01 ?
	//
	public static int Main()
	{
		int[] timein = new int[1000];
		int[] timeout = new int[1000];
		int[] max = new int[1000];
		int i;
		int j;
		int k;
		int count = 1;
		char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(timein, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(timeout, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(max, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < 1000; i++)
		{
			timein[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			else
			{
				count++;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			timeout[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			for (j = 0; j < count; j++)
			{
				if ((timein[j] <= i) && (timeout[j] > i))
				{
					max[i]++;
				}
			}
		}
		k = 0;
		for (i = 1; i < 1000; i++)
		{
			if (max[k] < max[i])
			{
				k = i;
			}
		}
		System.out.print(count);
		System.out.print(" ");
		System.out.print(max[k]);
		System.out.print("\n");
		return 0;
	}

}

