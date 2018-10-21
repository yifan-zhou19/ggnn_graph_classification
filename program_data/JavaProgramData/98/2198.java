package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[40]);
		int i;
		int n;
		int len;
		int hang = 0;
		int shou = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 word = tempVar2.charAt(0);
				 }
				 len = word.length();
				 hang += len;
				 hang += 1;
				 if (hang <= 80)
				 {
								 if (shou == 1)
								 {
								   System.out.printf("%s",word);
								   hang -= 1;
								 }
								 else
								 {
									 System.out.printf(" %s",word);
								 }
								shou = 0;
				 }
				 else if (hang > 80)
				 {
					 System.out.print("\n");
					 System.out.printf("%s",word);
					 shou = 0;
					 hang = len;
				 }
		}

	return 0;
	}

}

