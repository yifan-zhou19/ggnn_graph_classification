package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String p = new String(new char[5]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	 p = (char[5])calloc(5,(Character.SIZE / Byte.SIZE) * 5);
	 int i;
	 int j;
	 int n;
	 int m;
	 int t;
	 for (i = 0;i < 5;i++)
	 {
	 for (j = 0;j < 5;j++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 *(p.Substring(i)) + j = Integer.parseInt(tempVar);
	 }
	 }
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
	 if (n < 5 && n >= 0 && m < 5 && m >= 0)
	 {
		 for (j = 0;j < 5;j++)
		 {
	  t = (*(p.Substring(n)) + j),*(*(p.Substring(n)) + j) = *(*(p.Substring(m)) + j),*(*(p.Substring(m)) + j) = t;
		 }
	  for (i = 0;i < 5;i++)
	  {
	   System.out.printf("%d",**(p.Substring(i)));
	   for (j = 1;j < 5;j++)
	   {
	   System.out.printf(" %d",*(*(p.Substring(i)) + j));
	   }
	   System.out.print("\n");
	  }
	 }
	 else
	 {
		 System.out.print("error");
	 }
	}

}

