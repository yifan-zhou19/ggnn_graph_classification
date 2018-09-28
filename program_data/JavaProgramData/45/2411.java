package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zi = new String(new char[50]);
		String mu = new String(new char[50]);
	  int i;
	  int j;
	  int flag = 0;
	  int zichang;
	  int muchang;

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 zi = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 mu = tempVar2.charAt(0);
	 }
	 zichang = zi.length();
	 muchang = mu.length();
	 for (i = 0;i <= muchang - zichang;i++)
	 {
		 for (j = 0;j <= zichang - 1;j++)
		 {
		   if (zi.charAt(j) != mu.charAt(i + j))
		   {
			 flag = 1;
			 break;
		   }
		 }
	   if (flag != 1)
	   {
		   System.out.printf("%d",i);
		 break;
	   }
	   flag = 0;
	 }
	 System.in.read();
	 System.in.read();
	}
}

