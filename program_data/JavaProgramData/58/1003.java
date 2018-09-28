package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int m;
	 String[] p;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 p = (String)malloc(n * sizeof(String));
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p[i] = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
	 }
	 for (i = 0;i < n;i++)
	 {
	  p[i] = new Scanner(System.in).nextLine();
	 }
	 for (i = 0;i < n;i++)
	 {
		  if ((p[i] >= 'a' && p[i] <= 'z') || (p[i] >= 'A' && p[i] <= 'Z') || (p[i] == '_'))
		  {
			 m = String.valueOf(p[i]).length();
			 for (j = 0;j < m;j++)
			 {
			 if ((*(p[i] + j) >= 'a' && *(p[i] + j) <= 'z') || (*(p[i] + j) >= 'A' && *(p[i] + j) <= 'Z') || (*(p[i] + j) == '_') || (*(p[i] + j) >= '0' && *(p[i] + j) <= '9'))
			 {
				 k = 1;
			 }
			 else
			 {
			 k = 0;
			 break;
			 }
			 }
		  }
		  else
		  {
		  k = 0;
		  }
		  System.out.printf("%d\n",k);
	 }

	}
}

