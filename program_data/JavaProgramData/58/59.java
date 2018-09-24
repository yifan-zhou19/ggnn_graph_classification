package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String p;
		   int i;
		   int j;
		   int len;
		   int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *judge;
		   int judge;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   judge = (int)malloc(32 * (Integer.SIZE / Byte.SIZE));

		   for (i = 0;i < n;i++)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
			 p = new Scanner(System.in).nextLine();
			 len = p.length();
			 if (p == ' ' || (p >= 65 && p <= 90) || (p >= 97 && p <= 122) || p == 95)
			 {
			   for (j = 0;j < len;j++)
			   {
				 if (*(p.Substring(j)) < '0' || (*(p.Substring(j))>'9' && *(p.Substring(j)) < 65) || (*(p.Substring(j))>90 && *(p.Substring(j)) < 95) || *(p.Substring(j)) == 96 || (*(p.Substring(j))>122))
				 {
					 *(judge + i) = 0;
					 break;
				 }
			   }
			   if (j == len)
			   {
				   *(judge + i) = 1;
			   }
			 }
			 else
			 {
				 *(judge + i) = 0;
			 }
		   }
		   for (i = 0;i < n;i++)
		   {
			 System.out.printf("%d\n",*(judge + i));
		   }
	}

}

