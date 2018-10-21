package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t;
	int[] a = new int[27];
	int i;
	int j;
	int k;
	String str = new String(new char[100000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (i = 0;i < t;t++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,'\0',100000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,27 * (Integer.SIZE / Byte.SIZE));
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		for (j = 0;j < str.length();j++)
		{
		  k = str.charAt(j) - 96;
		  a[k]++;
		}
		 for (j = 0;j < str.length();j++)
		 {
		   k = str.charAt(j) - 96;
		  if (a[k] == 1)
		  {
			  System.out.printf("%c\n",str.charAt(j));
			  break;
		  }
		 }
		 if (j == str.length())
		 {
			 System.out.print("no\n");
		  break;
		 }
	}


	return 0;
	}
}

