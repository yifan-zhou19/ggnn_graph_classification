package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***?????2?N??***
	//***??????***
	//***???2013.1.13***
	//*************************************************
	public static int[] a = new int[100];

	public static void f()
	{
		int i;
		int t = 0;
		for (i = 0; i < 100; i++)
		{
			a[i] = a[i] * 2 + t;
			t = a[i] / 10;
			a[i] = a[i] % 10;
		}
	}

	public static int Main()
	{
		int N;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[0] = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < N; i++)
		{
			f();
		}
		i = 99;
		while (a[i] == 0)
		{
			i--;
		}
		for (j = i; j >= 0; j--)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return 0;
	}



}

