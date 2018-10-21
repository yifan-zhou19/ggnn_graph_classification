package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str1 = new String(new char[251]);
	  String str2 = new String(new char[251]);
	  int[] str3 = new int[252];
	  int k;
	  int t;
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
	  int i = str1.length() - 1;
	  int j = str2.length() - 1;
	  k = 0;
	  str3[0] = 0;
	 while (i >= 0 || j >= 0)
	 {
		 if (i >= 0 && j >= 0)
		 {
		t = str1.charAt(i) + str2.charAt(j) + str3[k] - '0'-'0';
		 }
		else
		{
			if (i < 0)
			{
				t = str2.charAt(j) + str3[k] - '0';
			}
			 else
			 {
				 t = str1.charAt(i) + str3[k] - '0';
			 }
		}
	   if (t > 9)
	   {
			str3[k] = t - 10;
		str3[k + 1] = 1;
	   }
	   else
	   {
		   str3[k] = t;
		str3[k + 1] = 0;
	   }
		j--;
		i--;
		k++;
	 }
	 for (;k > 0;k--)
	 {
	  if (str3[k] != 0)
	  {
	   break;
	  }
	 }
	  for (;k >= 0;k--)
	  {
	  System.out.printf("%d",str3[k]);
	  }


	}
}

