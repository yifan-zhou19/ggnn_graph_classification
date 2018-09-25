package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j = 0;
	 int k = 0;
	 String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
	 String q = new String(new char[10]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 q = (char[10])malloc(10 * 10 * (Character.SIZE / Byte.SIZE));
	 char[][] a = new char[10][10];
	 for (i = 0;i < 30;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead(null, 1);
	 if (tempVar != null)
	 {
		 p.Substring(i) = Integer.parseInt(tempVar);
	 }
	 }
	 for (i = 0; * (p.Substring(i)) != '\0';i++)
	 {
	   if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
	   {
		   *(*(q.Substring(j)) + k) = *(p.Substring(i));
		   k++;
	   }
	   else
	   {
		   if (*(p.Substring(i) + 1) >= '0' && *(p.Substring(i) + 1) <= '9')
		   {
		   *(*(q.Substring(j)) + k) = '\0';
		   j++;
		   k = 0;
		   }
	   }
	 }
	 for (i = 0;i <= j;i++)
	 {
	 System.out.printf("%s\n",*(q.Substring(i)));
	 }
	}
}

