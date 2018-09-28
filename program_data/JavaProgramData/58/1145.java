package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[81]);
	 int n;
	 int i;
	 int j;
	 int flag;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	 p = (char[81])calloc(n,(Character.SIZE / Byte.SIZE) * 81);
	 System.in.read();
	 *p = new Scanner(System.in).nextLine();
	 for (i = 1;i < n;i++)
	 {
	 *(p.Substring(i)) = new Scanner(System.in).nextLine();
	 }
	 for (i = 0;i < n;i++)
	 {
		 flag = 1;
	  if (*(*(p.Substring(i))) != '_' && (*(*(p.Substring(i))) > 'Z' || *(*(p.Substring(i))) < 'A') && (*(*(p.Substring(i)))>'z' || *(*(p.Substring(i))) < 'a'))
	  {
	  flag = 0;
	  }
	  if (flag == 1)
	  {
		  for (j = 0;j < String.valueOf(*(p.Substring(i))).length();j++)
		  {
	   if (*(*(p.Substring(i)) + j) != '_' && (*(*(p.Substring(i)) + j) > 'Z' || *(*(p.Substring(i)) + j) < 'A') && (*(*(p.Substring(i)) + j)>'z' || *(*(p.Substring(i)) + j) < 'a') && (*(*(p.Substring(i)) + j)>'9' || *(*(p.Substring(i)) + j) < '0'))
	   {
		   flag = 0;
		   break;
	   }
		  }
	  }
	  System.out.printf("%d\n",flag);
	 }
	}


}

