package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			 String zifu = new String(new char[MAX + 1]);
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 zifu = tempVar2.charAt(0);
			 }
			 for (j = 0;zifu.charAt(j);j++)
			 {
				 if (zifu.charAt(j) == 'A')
				 {
					 zifu = tangible.StringFunctions.changeCharacter(zifu, j, 'T');
				 }
				 else if (zifu.charAt(j) == 'G')
				 {
					 zifu = tangible.StringFunctions.changeCharacter(zifu, j, 'C');
				 }
				 else if (zifu.charAt(j) == 'C')
				 {
					 zifu = tangible.StringFunctions.changeCharacter(zifu, j, 'G');
				 }
				 else if (zifu.charAt(j) == 'T')
				 {
					 zifu = tangible.StringFunctions.changeCharacter(zifu, j, 'A');
				 }
			 }
			 if ((zifu.charAt(j)) == null)
			 {
			 System.out.printf("%s\n", zifu);
			 }
		}
		return 0;
	}
}

