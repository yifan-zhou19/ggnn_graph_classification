package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int ini;



	public static int Main()
	{
	 int n;
	 int k;
	 int ini;
	 int i;
	 int j;
	 int[] apple = new int[1001];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(apple,0,(Integer.SIZE / Byte.SIZE));

	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 ini = n - 1;
	 apple[n] = n - 1;
	for (i = n;i >= 1;i--)
	{
		if (apple[i] % (n - 1) == 0)
		{
		apple[i - 1] = apple[i] * n / (n - 1) + k;
		}
		else
		{
			apple[n] += n - 1;
			i = n + 1;
		}
	}

	System.out.print(apple[0]);
	System.out.print("\n");






	  return 0;

	}






}

