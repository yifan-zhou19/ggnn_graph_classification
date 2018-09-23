package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct counter
	//	{
	//		   int counter;
	//	}
	//	zm[52];
		String s = new String(new char[301]);
		int len;
		int i;
		int j;
		int counter = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 0;i < 52;i++)
		{
		zm[i].counter = 0;
		}
		for (i = 0;i < len;i++)
		{
						  if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
						  {
												 counter++;
												 zm[(s.charAt(i) - 97)].counter++;
						  }
						  else if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
						  {
							   counter++;
							   zm[(s.charAt(i) - 65 + 26)].counter++;
						  }
		}
		if (counter == 0)
		{
		System.out.print("No");
		}
		for (i = 26;i < 52;i++)
		{
						  if (zm[i].counter > 0)
						  {
						  System.out.printf("%c=%d\n",i + (65 - 26),zm[i].counter);
						  }
		}
		for (i = 0;i < 26;i++)
		{
						  if (zm[i].counter > 0)
						  {
						  System.out.printf("%c=%d\n",i + 97,zm[i].counter);
						  }
		}
		return 0;
	}
}

