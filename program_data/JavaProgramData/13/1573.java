package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***???????????***
	//***??????***
	//***???2012.12.19***
	//*************************************************
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[20000];
		int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		b[a[0]] = 1;
		for (i = 1; i < n; i++)
		{
			if (b[a[i]] == 0) //???????????
			{
				System.out.print(" ");
				System.out.print(a[i]);
				b[a[i]] = 1; //???????????
			}
		}
		return 0;
	}
}

