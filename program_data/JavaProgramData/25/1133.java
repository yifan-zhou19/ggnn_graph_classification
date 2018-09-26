package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int flag = 1;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] result = new int[109];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(result,0,(Integer.SIZE / Byte.SIZE));
	result[1] = 1;
	while (n > 0)
	{
	n--;
	for (int i = 1;i <= 100;i++)
	{
	   result[i] = result[i] * 2;
	}
	for (int i = 1;i <= 100;i++)
	{
	   if (result[i] >= 10)
	   {
		  result[i] = result[i] - 10;
		  result[i + 1]++;
	   }
	}
	}
	for (int i = 99;i >= 1;i--)
	{
		if (result[i] > 1e-6)
		{
		   flag = 0;
		}
		if (flag == 0)
		{
		   System.out.print(result[i]);
		}
	}
	return 0;
	}
}

