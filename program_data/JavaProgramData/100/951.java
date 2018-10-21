package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[300]);
	int[] sz = new int[26];
	int i;
	int len;
	int noprint = 1;
		 for (i = 0;i < 26;i++)
		 {
			  sz[i] = 0;
		 }
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	len = str.length();
		  for (i = 0;i < len;i++)
		  {
		 if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
		 {
				sz[str.charAt(i) - 97]++;
		 }
		  }
		 for (i = 0;i < 26;i++)
		 {
		 if (sz[i] > 0)
		 {
				noprint = 0;
				System.out.printf("%c=%d\n",i + 97,sz[i]);
		 }
		 }
		if (noprint != 0)
		{
			System.out.print("No");
		}
	return 0;
	}


}

