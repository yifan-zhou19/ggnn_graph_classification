package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] a = new int[30];
	  int min;
	  int j;
	  String s = new String(new char[150000]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s = tempVar2.charAt(0);
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(a,255,(Integer.SIZE / Byte.SIZE));
		 a[0] = 1000000;
		 for (j = 0;j < s.length();j++)
		 {
		   if (a[s.charAt(j) - 96] == -1)
		   {
			 a[s.charAt(j) - 96] = j;
		   }
			 else
			 {
			   a[s.charAt(j) - 96] = -2;
			 }
		 }
		 min = 0;
		 for (j = 1;j <= 26;j++)
		 {
		   if ((a[j] >= 0) && (a[j] < a[min]))
		   {
			 min = j;
		   }
		 }
		 if (min == 0)
		 {
		   System.out.print("no\n");
		 }
		 else
		 {
		   System.out.printf("%c\n",min + 96);
		 }
	  }
	}
}

