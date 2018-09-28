package <missing>;

public class GlobalMembers
{
	public static int jisuan(int n,int k)
	{
		final int boyNum = k;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int m=1;
		int m = 1;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int num;
		int num;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int allNum;
		int allNum; //????
		int i = 0;
		while (i < n - 1)
		{
		num = m;
		for (;i < n - 1;i++)
		{
		allNum = num * n + boyNum;
		if ((allNum % (n - 1)) != 0)
		{
		 i = 0; //??????
		 break;

		}
		num = allNum / (n - 1); //???(n-1)
		}
		m++;
		}
		allNum = num * n + boyNum;
		return (allNum);

	}

	public static int Main()
	{
		  int n;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  k = Integer.parseInt(tempVar2);
		  }
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int jisuanzhi;
		  int jisuanzhi;
		  jisuanzhi = jisuan(n, k);
		  System.out.printf("%u",jisuanzhi);
		  System.in.read();
		  System.in.read();

	}

}

