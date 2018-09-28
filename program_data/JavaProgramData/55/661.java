package <missing>;

public class GlobalMembers
{
	//*************************************************************************
	//???????????????????????????????????  *
	// ???????????????????????????????0?bug?
	//????????????                                                *
	//*************************************************************************
	//*************************************************************************
	public static final int size = 500;
	public static String inda = new String(new char[size]);
	public static String outda = new String(new char[size]);
	public static int[] indata = new int[size];
	public static int[] yu = new int[2 * size];
	public static int[] ddd = new int[size];
	public static int Main() //?????
	{
		int i;
		int j;
		int k;
		double inbase;
		double outbase;
		double la;
		double dec = 0;
		int[] map = new int[300];
		String rmap = new String(new char[65]);
		for (i = 'A';i <= 'Z';i++)
		{
			map[i] = i - 'A' + 10;
			rmap = tangible.StringFunctions.changeCharacter(rmap, i - 'A' + 10, i);
		} //??????????????????

		for (i = 'a';i <= 'z';i++)
		{
			map[i] = i - 'a' + 10;
			rmap = tangible.StringFunctions.changeCharacter(rmap, i - 'a' + 36, i);
		}
		for (i = '0';i <= '9';i++)
		{
			map[i] = i - '0';
			rmap = tangible.StringFunctions.changeCharacter(rmap, i - '0', i);
		}
		inbase = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		inda = ConsoleInput.readToWhiteSpace(true).charAt(0);
		outbase = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		la = inda.length();
		for (i = 0;i <= la - 1;i++)
		{
			indata[i] = map[inda.charAt(i)];
		}
		for (i = 0;i <= la - 1;i++)
		{
			dec = dec + indata[i] * Math.pow(inbase,la - i - 1);
		}
		ddd[0] = dec;
		i = 0; //??????????????
	   while (true)
	   {
		   if (i > 0 && ddd[i] == 0)
		   {
			   break;
		   }
		   ddd[i + 1] = ddd[i] / outbase;
	   yu[i] = ddd[i] % (int)outbase;
	   i++;
	   }
	   yu[i] = ddd[i] % (int)outbase; //????
	  for (j = 0;j <= i;j++)
	  {
		  outda = tangible.StringFunctions.changeCharacter(outda, j, rmap.charAt(yu[j]));
	  }
	  for (k = i - 1;k >= 0;k--)
	  {
		  System.out.print(outda.charAt(k));
	  }

	  return 0;
	}


}

