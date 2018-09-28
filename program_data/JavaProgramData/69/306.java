package <missing>;

public class GlobalMembers
{
	//2981?????
	// sst 2012.8.8 
	public static int Main()
	{
		String str1 = new String(new char[MAX_LEN + 10]);
		String str2 = new String(new char[MAX_LEN + 10]);
		int[] an1 = new int[MAX_LEN + 10];
		int[] an2 = new int[MAX_LEN + 10];
		int i;
		int j;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2,0,(Integer.SIZE / Byte.SIZE));
	   int Lenth1 = str1.length();
	   for (j = 0,i = Lenth1 - 1;i >= 0;i--,j++)
	   {
		   an1[j] = str1.charAt(i) - '0';
	   }
	   int Lenth2 = str2.length();
	   for (j = 0,i = Lenth2 - 1;i >= 0;i--,j++)
	   {
		   an2[j] = str2.charAt(i) - '0';
	   }
		   int Highestpos = 0;
	   for (int i = 0;i < MAX_LEN;i++)
	   {
			  an1[i] = an1[i] + an2[i];
			  if (an1[i] >= 10)
			  {
						   an1[i] = an1[i] - 10;
						   an1[i + 1] = an1[i + 1] + 1;
			  }
			  if (an1[i] != 0)
			  {
				Highestpos = i;
			  }
	   }
	   for (i = Highestpos;i >= 0;i--)
	   {
	   System.out.print(an1[i]);
	   }
	   return 0;
	}

}
