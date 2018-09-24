package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 String[] p;
	 char a;
	 String b = new String(new char[10]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 b = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc(n * (Character.SIZE / Byte.SIZE));
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p[i] = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
	  p[i] = new Scanner(System.in).nextLine();
	  j = 0;
	  while (*(p[i] + j) != '\0')
	  {
	   a = (p[i] + j);
	   k = 1;
	   while (*(p[i] + j + k) != '\0')
	   {
		   if (*(p[i] + j + k) == a)
		   {
			   *(p[i] + j) = '0';
			   *(p[i] + j + k) = '0';
		   }
		   k++;
	   }
	   j++;
	  }
	  j = 0;
	  while (*(p[i] + j) != '\0')
	  {
		  if (*(p[i] + j) != '0')
		  {
			  System.out.printf("%c\n",*(p[i] + j));
			  break;
		  }
		  j++;
	  }
	  if (*(p[i] + j) == '\0')
	  {
		  System.out.print("no");
	  }
	 }
	}
}

