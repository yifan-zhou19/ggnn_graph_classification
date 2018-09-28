package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int flag;
	 String p;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p = (String)malloc(81 * (Character.SIZE / Byte.SIZE));
	  p = new Scanner(System.in).nextLine();
	  flag = 1;
	  if (p != '_' && (p < 'A' || p>'Z') && (p < 'a' || p>'z'))
	  {
		  flag = 0;
	  }
	  for (j = 1; * (p.Substring(j)) != '\0';j++)
	  {
		  if ((*(p.Substring(j)) != '_') && (*(p.Substring(j)) < 'A' || *(p.Substring(j))>'Z') && (*(p.Substring(j)) < 'a' || *(p.Substring(j))>'z') && (*(p.Substring(j)) < '0' || *(p.Substring(j))>'9'))
		  {
			  flag = 0;
		  }
	  }
	  System.out.printf("%d\n",flag);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(p);
	 }
	}
}

