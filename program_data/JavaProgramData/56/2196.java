package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int inPut;
		int outPut;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			inPut = Integer.parseInt(tempVar);
		}
		if (inPut < 10)
		{
			System.out.printf("%d",inPut);
		}
		else if (inPut >= 10 && inPut < 100)
		{
			outPut = (inPut % 10) * 10 + (inPut / 10);
		}
		else if (inPut >= 100 && inPut < 1000)
		{
			outPut = (inPut % 10) * 100 + ((inPut / 10) % 10) * 10 + (inPut / 100);
		}
		else if (inPut >= 1000 && inPut < 10000)
		{
			outPut = (inPut % 10) * 1000 + ((inPut / 10) % 10) * 100 + ((inPut / 100) % 10) * 10 + inPut / 1000;
		}
		else if (inPut >= 10000 && inPut < 100000)
		{
			outPut = (inPut % 10) * 10000 + ((inPut / 10) % 10) * 1000 + ((inPut / 100) % 10) * 100 + ((inPut / 1000) % 10) * 10 + (inPut / 10000);
		}
		System.out.printf("%d",outPut);
		return 0;
	}

}

