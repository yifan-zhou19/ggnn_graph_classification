package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str1 = new String(new char[50]);
	   String str2 = new String(new char[50]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str1 = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   str2 = tempVar2.charAt(0);
	   }
	   int len1;
	   int len2;
	   len1 = str1.length();
	   len2 = str2.length();
	   int i;
	   int j;
	   for (j = 0;j < len2;j++)
	   {
		   if (str2.charAt(j) == str1.charAt(0))
		   {
			   for (i = 0;i < len1;i++)
			   {

				   if (str2.charAt(j + i) != str1.charAt(i))
				   {
					   break;
				   }
			   }
		   }
			   if (i == len1)
			   {
					System.out.printf("%d\n",j);
					break;
			   }

	   }
	   return 0;
	}
}

