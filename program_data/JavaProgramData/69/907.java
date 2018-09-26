package <missing>;

public class GlobalMembers
{
	/*
	A:?????????????????: 1000ms????: 65536kB
	??
	??????200?????????
	??
	????????????200??????????????0?
	??
	??????????????????????0???????342?????????0342? 
	????
	22222222222222222222
	33333333333333333333????
	55555555555555555555
	*/

	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] aint = new int[300];
		int[] bint = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(aint,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(bint,0,(Integer.SIZE / Byte.SIZE));
		int la;
		int lb;
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		la = a.length();
		lb = b.length();
		j = la - 1;
		for (i = 0;i < la;i++)
		{
			aint[j--] = a.charAt(i) - '0';
		}
		j = lb - 1;
		for (i = 0;i < lb;i++)
		{
			bint[j--] = b.charAt(i) - '0';
		}
		if (la < lb)
		{
			la = lb;
		}
		for (i = 0;i < la;i++)
		{
			 aint[i] += bint[i];
		}
		 for (i = 0;i < la;i++)
		 {
			 if (aint[i] >= 10)
			 {
				 aint[i + 1]++;
				 aint[i] %= 10;
			 }
		 }
		int t = 0;
		for (i = 299;i >= 0;i--)
		{
			if (aint[i] != 0)
			{
				 t = 1;
			}
			if (t != 0)
			{
				System.out.print(aint[i]);
			}
			if (i == 0 && t == 0)
			{
				System.out.print("0");
			}
		}
		System.out.print("\n");
		return 0;
	}




}

