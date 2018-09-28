package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[100000]);
	 int[] b = new int[26];
	 int i;
	 int j;
	 int t;
	 int lenth;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }
	 for (j = 0;j < t;j++)
	 {
		 n = 1;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = tempVar2.charAt(0);
	 }
	 lenth = a.length();
	 for (i = 0;i < 26;i++)
	 {
		 b[i] = 0;
	 }
	 for (i = 0;i < lenth;i++)
	 {

			 b[a.charAt(i) - 'a'] = b[a.charAt(i) - 'a'] + 1;
	 }
	 for (i = 0;i < lenth;i++)
	 {
	  if (b[a.charAt(i) - 'a'] == 1)
	  {
	   System.out.printf("%c\n",a.charAt(i));
	   n = 0;
	   break;
	  }
	 }
	 if (n == 1)
	 {
	  System.out.print("no\n");
	 }

	 for (i = 0;i < lenth;i++)
	 {
	  a = a.substring(0, i);
	 }
	 for (i = 0;i < 26;i++)
	 {
	  b[i] = 0;
	 }
	 }

	 return 0;
	}


}

