package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int S=0;
		int S = 0;
		for (i = 1;i <= n;i++)
		{
			if (n < 100 && n>0)
			{
			  if (i % 7 == 0)
			  {
				  S += 0;
			  }
			  else if ((i - 7) % 10 == 0)
			  {
				  S += 0;
			  }
			  else if ((i - 70) < 10 && (i - 70)>0)
			  {
				  S += 0;
			  }
			  else
			  {
				  S += i * i;
			  }
			}



		}
		System.out.printf("%u\n",S);
		return 0;
	}

}

