package <missing>;

public class GlobalMembers
{
	//*5-1
	public static int MyInverseitoa(int iNum, tangible.RefObject<String> ch, int radix)
	{
		int iBits = 0;
	   //?iNum?????10????????????????? 
		do
		{
			ch.argValue.charAt(iBits++) = iNum % radix;
			iNum /= radix;
		} while (iNum != 0);
		ch.argValue.charAt(iBits) = '\0';
		return iBits - 1;
	}

	public static int Myatoi(tangible.RefObject<String> ch, int iBits)
	{
		int iNumInverse = 0;
		int i = 0;
	//100->001
		while (ch.argValue.charAt(i) == '\0')
		{
			i++;
			System.out.print("0");
		}
		for (i = 0; i <= iBits; i++)
		{
			iNumInverse = 10 * iNumInverse + ch.argValue.charAt(i);
		}
		return iNumInverse;
	}

	public static int Main()
	{
		int iNum;
		int iNumInverse;
		int iBits = 0;

		String ch = new String(new char[12]); ///int ??10?
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			iNum = Integer.parseInt(tempVar);
		}
		if (iNum == 0)
		{
			iNumInverse = iNum;
			System.out.printf("%d", iNumInverse);
		}
		else
		{
		tangible.RefObject<String> tempRef_ch = new tangible.RefObject<String>(ch);
			iBits = MyInverseitoa(iNum, tempRef_ch, 10); //?????'\0'
			ch = tempRef_ch.argValue;
		tangible.RefObject<String> tempRef_ch2 = new tangible.RefObject<String>(ch);
			iNumInverse = Myatoi(tempRef_ch2, iBits);
			ch = tempRef_ch2.argValue;
			System.out.printf("%d", iNumInverse);
		}

		return 0;
	}
}

