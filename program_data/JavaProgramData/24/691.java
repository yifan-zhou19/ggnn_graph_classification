package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String x = new String(new char[1000]);
	  x = new Scanner(System.in).nextLine(); //???gets()???????????
	  int indexOfShort = 0; //??????????x????
	  int indexOfLong = 0;
	  int lenOfShort = 10000; //????????????
	  int lenOfLong = 0;
	  int curLen = 0; //????????x????
	  int curIndex = 0;
	  for (int i = 0; i < x.length(); ++i)
	  {
		if (x.charAt(i) != ' ')
		{ //????????????????
		  curLen++;
		  if (i != x.length() - 1)
		  {
			  continue;
		  }
		}
		if (curLen < lenOfShort)
		{
		   lenOfShort = curLen;
		   indexOfShort = curIndex;
		}
		if (curLen > lenOfLong)
		{
		   lenOfLong = curLen;
		   indexOfLong = curIndex;
		}
		curIndex = i + 1;
		curLen = 0;
	  }

	  for (int i = 0; i != lenOfLong; ++i) //?????
	  {
		System.out.printf("%c",x.charAt(indexOfLong + i));
	  }

	  System.out.print("\n");

	  for (int i = 0; i != lenOfShort; ++i) //?????
	  {
		System.out.printf("%c",x.charAt(indexOfShort + i));
	  }

	  return 0;
	}

}
