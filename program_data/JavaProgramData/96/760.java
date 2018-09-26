package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//* file: 3.cpp
	//* description: ??13
	//* author: ?? 1200012858
	//* date: 2012-11-18
	//*******************************************************
	public static int Main()
	{
		final String num = "";
		int[] a = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, -1, (Integer.SIZE / Byte.SIZE)); // ??????-1
		int i;
		int j;
		int k;
		int r = 0;
		int count = 0;
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; num.charAt(i) != 0; i++)
		{
			 a[i] = (r * 10 + num.charAt(i) - '0') / 13;
			 r = (r * 10 + num.charAt(i) - '0') % 13;
		}
		if (a[1] == -1)
		{
			System.out.print(0);
		}
		if (a[0] == 0 && a[1] == 0 && a[2] == -1)
		{
			System.out.print(0);
		}
		for (k = 0; ; k++)
		{
			if (a[k] != 0)
			{
				break;
			}
		}
		for (j = k; j < i; j++)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		System.out.print(r);
		System.out.print("\n");
		return 0;
	}



}

