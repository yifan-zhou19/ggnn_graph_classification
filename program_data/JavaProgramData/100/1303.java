package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int[] count = new int[27];
		int flag = 0;
		int i;
		int j;
		int n = a.length();
		for (i = 0;i <= n;i++)
		{
						 for (j = 97;j < 123;j++)
						 {
										  if (a.charAt(i) == j)
										  {
											  count[j - 97]++;
										  }
						 }
		}
		char[] word = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, '\0'};
		//char *p=&word[0];
		for (i = 0;i < 26;i++)
		{
						 if (count[i] != 0)
						 {
								System.out.printf("%c=%d\n",word[i],count[i]);
								flag = 1;
						 }

		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		System.in.read();
		System.in.read();
		return 0;
	}





}

