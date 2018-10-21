package <missing>;

public class GlobalMembers
{
	public static int[] an1 = new int[MAX_LEN + 10];
	public static int[] an2 = new int[MAX_LEN + 10];
	public static String szLine1 = new String(new char[MAX_LEN + 10]);
	public static String szLine2 = new String(new char[MAX_LEN + 10]);

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			szLine1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			szLine2 = tempVar2.charAt(0);
		}
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2, 0, (Integer.SIZE / Byte.SIZE));
		 int nLen1 = szLine1.length();
		 j = 0;
		 for (i = nLen1 - 1;i >= 0 ; i--)
		 {
			  an1[j++] = szLine1.charAt(i) - '0';
		 }

		 int nLen2 = szLine2.length();
		 j = 0;
		 for (i = nLen2 - 1;i >= 0 ; i--)
		 {
			  an2[j++] = szLine2.charAt(i) - '0';
		 }

		 for (i = 0;i < MAX_LEN ; i++)
		 {
			 an1[i] += an2[i];
			 if (an1[i] >= 10)
			 {
					 an1[i] -= 10;
					 an1[i + 1]++;
			 }
		 }

		 char bStartOutput = false;
		 for (i = MAX_LEN; i >= 0; i--)
		 {
			  if (bStartOutput != null)
			  {
				  System.out.printf("%d", an1[i]);
			  }
			  else if (an1[i])
			  {
				   System.out.printf("%d", an1[i]);
				   bStartOutput = true;
			  }
		 }
		 if (bStartOutput == null)
		 {
			  System.out.print("0");
		 }


		 return 0;
	}

}

